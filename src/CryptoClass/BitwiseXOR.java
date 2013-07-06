package CryptoClass;

public class BitwiseXOR
	{

		public static String XOR( String s1, String s2, boolean pad )
			{
			// System.out.println("XORing started");

			// calculate lengths of strings
			int length = 0;
			int s1Len = s1.length();
			int s2Len = s2.length();
			int lengthDifference = s1Len - s2Len;

			// set length and pad shorter string
			if ( lengthDifference == 0 )
				{
				length = s1Len;
				}
			else if ( lengthDifference > 0 )
				{
				if ( pad )
					{
					length = s1Len;
					s2 = pad( s2, lengthDifference / 2 );
					}
				else
					{
					length = s2Len;
					}

				}
			else
				{
				if ( pad )
					{
					length = s2Len;
					s1 = pad( s1, ( -lengthDifference ) / 2 );
					}
				else
					{
					length = s1Len;
					}
				}

			// System.out.println(s1);
			// System.out.println(s2);
			StringBuilder result = new StringBuilder();
			// compare each
			for ( int i = 0; i < length - 1; i += 2 )
				{
				// if (i < s2.length()){
				String s1Output = s1.substring( i, i + 2 );
				String s2Output = s2.substring( i, i + 2 );
				// System.out.println("Substrings are: " + s1Output + " and " +
				// s2Output);
				int s1Decimal = Integer.parseInt( s1Output, 16 );
				int s2Decimal = Integer.parseInt( s2Output, 16 );
				// System.out.println("Decimals are: " + s1Decimal + " and " +
				// s2Decimal);

				int s = s1Decimal ^ s2Decimal;
				// System.out.println("Bitwise XOR (dec): " + s);

				String h = Integer.toHexString( s );
				if ( h.length() == 1 )
					{
					h = "0".concat( h );
					}
				// System.out.println("Bitwise XOR (hex): " + h);
				result.append( h );
				// }

				}
			// System.out.println("--------------------------------");
			// System.out.println("Hex Result = " + result);
			return result.toString();
			}

		private static String pad( String s, int n )
			{
			StringBuilder padding = new StringBuilder();
			for ( int i = 0; i < n; i++ )
				{
				padding.append( "00" );
				}
			return s.concat( padding.toString() );
			}

	}
