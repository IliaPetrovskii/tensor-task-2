package n2

enum class Suit {
    CLUBS, DIAMONDS, SPADES, HEARTS
}

data class Card(val rank: Int, val suit: Suit) : Comparable<Card> {

    fun checkStandardDeck(): Boolean {
        return if (rank in 2..14) true else rank == 15 && (suit === Suit.CLUBS || suit === Suit.HEARTS)
    }

    fun checkIsStronger(card: Card): Boolean {
        return suit === card.suit && rank > card.rank
    }

    override fun toString(): String {
        val str = when (rank) {
            11 -> "Jack"
            12 -> "Queen"
            13 -> "King"
            14 -> "Ace"
            15 -> if (suit === Suit.CLUBS) return "Black Joker" else if (suit === Suit.HEARTS) return "Colored Joker" else rank.toString()
            else -> rank.toString()
        }
        return "$str of ${suit.name}"
    }

    override fun compareTo(other: Card): Int {
        return if (suit !== other.suit) suit.ordinal - other.suit.ordinal else rank - other.rank
    }

    companion object {
        fun compare(firstCard: Card, secondCard: Card): Int {
            return firstCard.compareTo(secondCard)
        }
    }
}