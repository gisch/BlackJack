public class Card
	{

		private String suit;
		private String rank;
		private int value;
		
		public Card(String su, String ra,int va)
		{
		suit = su;
		rank = ra;
		value = va;
		}

		public String getSuit()
			{
				return suit;
			}

		public void setSuit(String suit)
			{
				this.suit = suit;
			}

		public String getRank()
			{
				return rank;
			}

		public void setRank(String rank)
			{
				this.rank = rank;
			}

		public int getValue()
			{
				return value;
			}

		public void setValue(int value)
			{
				this.value = value;
			}

	}