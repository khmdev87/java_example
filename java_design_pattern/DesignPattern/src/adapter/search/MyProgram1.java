package adapter.search;

public class MyProgram1 {
  private SearchButton searchButton = new SearchButton(this);

  public void setModeAll() {
    searchButton.setSearchStrategy(new SearchStratagyAll());
  }

  public void setModeImage() {
    searchButton.setSearchStrategy(new SearchStratagyImage());
  }

  public void setModeNews() {
    searchButton.setSearchStrategy(new SearchStratagyNews());
  }

  public void setModeMap() {
    searchButton.setSearchStrategy(new SearchStratagyMap());
  }

  // ...
  public void setModeMovie() {
    searchButton.setSearchStrategy(
        new SearchFindAdapter(new FindMovieAlgorithm()));
  }

  public void testProgram() {
    searchButton.onClick(); // "SEARCH ALL" 출력
    setModeImage(); // 이미지검색 모드로
    searchButton.onClick(); // "SEARCH IMAGE" 출력
    setModeNews(); // 뉴스검색 모드로
    searchButton.onClick(); // "SEARCH NEWS" 출력
    setModeMap(); // 지도검색 모드로
    searchButton.onClick(); // "SEARCH MAP" 출력
    setModeMovie(); // addpater 동영상 검색 모드로
    searchButton.onClick();
  }
}