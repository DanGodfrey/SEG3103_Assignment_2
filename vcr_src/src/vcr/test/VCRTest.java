package vcr.test;

import static org.junit.Assert.*;

import org.junit.Test;

import vcr.state.*;
import vcr.util.*;



public class VCRTest {
	
	
	@Test
	//1.5
	public void PlayWhilePlay()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
	}
	
	@Test
	//2.5
	public void StopWhilePlay()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
		vcrMngr.processEvent(new VCREvent(VCREvent.STOP));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//3.5
	public void RewindWhilePlay()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//4.5
	public void FwdWhilePlay()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
	}
	
	@Test
	//5.5
	public void ReverseWhilePlay()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
	}
	
	@Test
	//6.5
	public void CueWhilePlay()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
		vcrMngr.processEvent(new VCREvent(VCREvent.CUE));
		assertTrue(vcrMngr.getState() instanceof Cue);
	}
	
	@Test
	//7.5
	public void PauseWhilePlay()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
	}
	
	@Test
	//8.5
	public void RecordWhilePlay()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
	}
	
	@Test
	//9.5
	public void EoTWhilePlay()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//10.5
	public void SoTWhilePlay()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
		vcrMngr.processEvent(new VCREvent(VCREvent.START_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//11.5
	public void EjectWhilePlay()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
		vcrMngr.processEvent(new VCREvent(VCREvent.EJECT));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//12.5
	public void PowerWhilePlay()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//13.4
	public void StopWhileIdle()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.STOP));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	
	@Test
	//14.5
	public void RewindWhileRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//15.5
	public void StopWhileRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.STOP));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//16.5
	public void PlayWhileRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
	}
	
	@Test
	//17.5
	public void FwdWhileRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
	}
	
	@Test
	//18.5
	public void ReverseWhileRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//19.5
	public void CueWhileRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.CUE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//20.5
	public void PauseWhileRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//21.5
	public void RecordWhileRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//22.5
	public void EoTWhileRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}

	@Test
	//23.5
	public void SoTWhileRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.START_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//24.5
	public void EjectWhileRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.EJECT));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//25.5
	public void PowerWhileRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	
	@Test
	//26.5
	public void PlayWhileFWD()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
	}
	
	@Test
	//27.5
	public void StopWhileFWD()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
		vcrMngr.processEvent(new VCREvent(VCREvent.STOP));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//28.5
	public void RewindWhileFWD()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//29.5
	public void FWDWhileFWD()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
	}
	
	@Test
	//30.5
	public void ReverseWhileFWD()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof FWD);
	}
	
	@Test
	//31.5
	public void CueWhileFWD()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
		vcrMngr.processEvent(new VCREvent(VCREvent.CUE));
		assertTrue(vcrMngr.getState() instanceof FWD);
	}
	
	@Test
	//32.5
	public void PauseWhileFWD()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof FWD);
	}
	
	@Test
	//33.5
	public void RecordWhileFWD()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof FWD);
	}
	
	@Test
	//34.5
	public void EoTWhileFWD()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//35.5
	public void SoTWhileFWD()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
		vcrMngr.processEvent(new VCREvent(VCREvent.START_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//36.5
	public void EjectWhileFWD()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
		vcrMngr.processEvent(new VCREvent(VCREvent.EJECT));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//37.5
	public void PowerWhileFWD()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//38.5
	public void PlayWhileReverse()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
	}
	
	@Test
	//39.5
	public void StopWhileReverse()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
		vcrMngr.processEvent(new VCREvent(VCREvent.STOP));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//40.5
	public void RewindWhileReverse()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//41.5
	public void FwdWhileReverse()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
	}
	
	@Test
	//42.5
	public void ReverseWhileReverse()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
	}
	
	@Test
	//43.1 - 43.5
	public void CueWhileReverse()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
		vcrMngr.processEvent(new VCREvent(VCREvent.CUE));
		assertTrue(vcrMngr.getState() instanceof Cue);
	}
	
	@Test
	//44.1 - 44.5
	public void PauseWhileReverse()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
	}
	
	@Test
	//45.1 - 45.5
	public void RecordWhileReverse()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Reverse);
	}
	
	@Test
	//46.1 - 46.5
	public void EoTWhileReverse()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//47.1 - 47.5
	public void SoTWhileReverse()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
		vcrMngr.processEvent(new VCREvent(VCREvent.START_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//48.1 - 48.5
	public void EjecteWhileReverse()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
		vcrMngr.processEvent(new VCREvent(VCREvent.EJECT));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//49.1 - 49.5
	public void PowerWhileReverse()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//50.1 - 50.5
	public void PlayWhileCue()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.CUE));
		assertTrue(vcrMngr.getState() instanceof Cue);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
	}
	
}
