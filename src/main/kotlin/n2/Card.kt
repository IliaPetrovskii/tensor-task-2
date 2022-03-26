package n2

enum class Suit {
    CLUBS, DIAMONDS, SPADES, HEARTS
}

class Card(private val rank: Int, private val suit: Suit) {

    fun getRank(): Int {
        return rank
    }

    fun getSuit(): Suit {
        return suit
    }

    fun checkStandardDeck(): Boolean {
        return if (rank in 2..14) true else rank == 15 && (suit === Suit.CLUBS || suit === Suit.HEARTS)
    }

    fun checkIsStronger(card: Card): Boolean {
        return suit === card.suit && rank > card.rank
    }

    override fun toString(): String {
        val str: String = when (rank) {
            11 -> "Jack"
            12 -> "Queen"
            13 -> "King"
            14 -> "Ace"
            15 -> if (suit === Suit.CLUBS) return "Black Joker" else if (suit === Suit.HEARTS) return "Colored Joker" else rank.toString()
            else -> rank.toString()
        }
        return str + " of " + suit.name
    }

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (this === other) return true
        if (other !is Card) return false
        return (rank == other.rank) && (suit == other.suit)
    }

    override fun hashCode(): Int {
        return rank * 31 + suit.hashCode()
    }

    operator fun compareTo(other: Card): Int {
        return if (suit !== other.suit) suit.ordinal - other.suit.ordinal else rank - other.rank
    }

    companion object {
        fun compare(firstCard: Card, secondCard: Card): Int {
            return firstCard.compareTo(secondCard)
        }
    }
}