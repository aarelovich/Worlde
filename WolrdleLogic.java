public class WordleLogic {

   

   public class Letter {
      private char letter;
      private boolean isCorrectPosition;
      private boolean isPresent;

      public Letter(char letter) {
         this.letter = letter;
         this.isCorrectPosition = false;
         this.isPresent = false;
      }

      public char getLetter() {
         return letter;
      }

      public boolean isCorrectPosition() {
         return isCorrectPosition;
      }

      public void setCorrectPosition(boolean correctPosition) {
         isCorrectPosition = correctPosition;
      }

      public boolean isPresent() {
         return isPresent;
      }

      public void setPresent(boolean present) {
         isPresent = present;
      }
   }



}