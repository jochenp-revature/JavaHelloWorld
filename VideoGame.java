package src;

public class VideoGame {

        public  String title;
        public  int year;
        public  String rating;
        public  String[] platforms;

        public VideoGame() {
        }
        
        public VideoGame(String title, int year, String rating, 
                String[] platforms) {
            this.title = title;
            this.year = year;
            this.rating = rating;
            this.platforms = platforms;
        }
        
        public  String getTitle() {
            return title;
        }
    
        public  void setTitle(String title) {
            this.title = title;
        }
    
        public  int getYear() {
            return year;
        }
    
        public  void setYear(int year) {
            this.year = year;
        }
    
        public  String getRating() {
            return rating;
        }
    
        public  void setRating(String rating) {
            this.rating = rating;
        }
    
        public  String[] getPlatforms() {
            return platforms;
        }
    
        public  void setPlatforms(String[] platforms) {
            this.platforms = platforms;
        }
        @Override
        public String toString()
        {
            String result = "";
            result += "\nTitle: "+ getTitle() + "\nYear: "+getYear()+
                    "\nRating: "+getRating()+"\nPlatforms: ";
            for (String platform : getPlatforms()) {
                result += platform + "  ";
            }
            return result;
        }
    
}
