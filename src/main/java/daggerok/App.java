package daggerok;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
  public static void main(String[] args) {
    log.debug("DEBUG");
    log.info("INFO");
    log.warn("WARN");
    log.error("ERORR");
  }
}
