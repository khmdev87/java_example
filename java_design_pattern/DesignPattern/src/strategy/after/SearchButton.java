package strategy.after;

public class SearchButton {

  private MyProgram1 myProgram1;

  public SearchButton (MyProgram1 _myProgram) {
    myProgram1 = _myProgram;
  }

  private SearchStrategy searchStrategy = new SearchStratagyAll();
  
  public void setSearchStrategy (SearchStrategy _searchStrategy) {
    searchStrategy = _searchStrategy;
  }

  public void onClick () {
    searchStrategy.search();
  }
}