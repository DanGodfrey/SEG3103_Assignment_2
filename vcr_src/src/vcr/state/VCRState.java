package vcr.state;

import vcr.util.*;

public interface VCRState {

  public VCRState handle(VCREvent event);
  public String toString();

}

