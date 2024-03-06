
package informationbook;
public class information {
   String title;
   String author;
   String genre;
   String datepub;
   String available;
   String quantity;
   String loantime;
   String user;
   String loandate;
   String retudate;
   
   public information(String title,String author,String genre,String datepub,String available,String quantity,String loantime,String user,String loandate,String retudate ){
       this.title  = title;
       this.author = author;
       this.genre = genre;
       this.datepub = datepub;
       this.available = available;
       this.quantity = quantity;
       this.loantime = loantime;
       this.user = user;
       this.loandate = loandate;
       this.retudate = retudate;
   }
   public information(){}
        
         public void saySomething(){
             System.out.println(this.title);
             System.out.println(this.author);
             System.out.println(this.genre);
             System.out.println(this.datepub);
             System.out.println(this.available);
             System.out.println(this.quantity);
             System.out.println(this.loantime);
             System.out.println(this.user);
             System.out.println(this.loandate);
             System.out.println(this.retudate);
             
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDatepub() {
        return datepub;
    }

    public void setDatepub(String datepub) {
        this.datepub = datepub;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getLoantime() {
        return loantime;
    }

    public void setLoantime(String loantime) {
        this.loantime = loantime;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLoandate() {
        return loandate;
    }

    public void setLoandate(String loandate) {
        this.loandate = loandate;
    }

    public String getRetudate() {
        return retudate;
    }

    public void setRetudate(String retudate) {
        this.retudate = retudate;
    }
}
