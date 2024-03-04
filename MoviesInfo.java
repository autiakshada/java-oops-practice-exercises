/*Design the classes with the following specification:
Media Class: Represents a generic media item available for
			 streaming.
Attributes: mediaId,title,duration(in minutes).
Methods: getter and setter for attributes,toString()
		 method to display media information.
Movie Class: Represents a movie available for streaming,
			 inheriting from the media class
Additional attributes: director , genre.
Methods:getters and setters for additional attributes,
	    override the toString() method to include movie-specific 
		information.

Input Format- 
		First line represents the media id.
		Second line represents the title.
		Third line represents duration.
		Fourth line represents director name.
		Last line represents the genre

Sample Input-
		101
		The Shawshank Redemption
		142
		Frank Darabont
		Drama

Sample Output-
		Movie Information:
		Media ID:101,Titile:The Shawshank Redemption, Duration(minutes):142, Director:Frank Darabont, Genre:Drama
*/
import java.util.Scanner;
class Media 
{
    private int mediaId;
    private String title;
    private int duration;

    // Constructor
    public Media(int mediaId, String title, int duration) 
	{
        this.mediaId = mediaId;
        this.title = title;
        this.duration = duration;
    }

    // Getters and Setters to get and set/Modify the private data
    public int getMediaId() 
	{
        return mediaId;
    }

    public void setMediaId(int mediaId) 
	{
        this.mediaId = mediaId;
    }

    public String getTitle() 
	{
        return title;
    }

    public void setTitle(String title) 
	{
        this.title = title;
    }

    public int getDuration()
	{
        return duration;
    }

    public void setDuration(int duration) 
	{
        this.duration = duration;
    }

    // toString method
    @Override
    public String toString() 
	{
        return "Media ID: " + mediaId + ", Title: " + title + ", Duration(minutes): " + duration;
    }
}

class Movie extends Media
{
    private String director;
    private String genre;

    // Constructor
    public Movie(int mediaId, String title, int duration, String director, String genre) 
	{
        super(mediaId, title, duration);
        this.director = director;
        this.genre = genre;
    }

    // Getters and Setters to get and set/modify the private data
    public String getDirector() 
	{
        return director;
    }

    public void setDirector(String director) 
	{
        this.director = director;
    }

    public String getGenre() 
	{
        return genre;
    }

    public void setGenre(String genre) 
	{
        this.genre = genre;
    }

    // Override toString method
    @Override
    public String toString() 
	{
        return "Movie Information:\n" + super.toString() + ", Director: " + director + ", Genre: " + genre;
    }
}

class MoviesInfo
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int mediaId = sc.nextInt();
        String title = sc.next();
        int duration =sc.nextInt();
        String director = sc.nextLine();
        String genre = sc.nextLine();
		// Create Movie object
        Movie movie = new Movie(mediaId, title, duration, director, genre);
		// Display movie information
        System.out.println(movie.toString());
	}
}

