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
	
	@Test
	//51.1 - 51.5
	public void StopWhileCue()
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
		vcrMngr.processEvent(new VCREvent(VCREvent.STOP));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//52.1 - 52.5
	public void RewindWhileCue()
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
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//53.1 - 53.5
	public void FwdWhileCue()
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
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
	}
	
	@Test
	//54.1 - 54.5
	public void ReverseWhileCue()
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
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
	}
	
	@Test
	//55.1 - 55.5
	public void CueWhileCue()
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
		vcrMngr.processEvent(new VCREvent(VCREvent.CUE));
		assertTrue(vcrMngr.getState() instanceof Cue);
	}
	
	@Test
	//56.1 - 56.5
	public void PauseWhileCue()
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
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
	}
	
	@Test
	//57.1 - 57.5
	public void RecordWhileCue()
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
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Cue);
	}
	
	@Test
	//58.1 - 58.5
	public void EoTWhileCue()
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
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//59.1 - 59.5
	public void SoTWhileCue()
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
		vcrMngr.processEvent(new VCREvent(VCREvent.START_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//60.1 - 60.5
	public void EjectWhileCue()
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
		vcrMngr.processEvent(new VCREvent(VCREvent.EJECT));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//61.1 - 61.5
	public void PowerWhileCue()
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
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//62.1 - 62.5
	public void PlayWhileRecord()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Record);
	}
	
	@Test
	//63.1 - 63.5
	public void StopWhileRecord()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.STOP));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//64.1 - 64.5
	public void RewindWhileRecord()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Record);
	}
	
	@Test
	//65.1 - 65.5
	public void FwdWhileRecord()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof Record);
	}
	
	@Test
	//66.1 - 66.5
	public void ReverseWhileRecord()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Record);
	}
	
	@Test
	//67.1 - 67.5
	public void CueWhileRecord()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.CUE));
		assertTrue(vcrMngr.getState() instanceof Record);
	}
	
	@Test
	//68.1 - 68.5
	public void PauseWhileRecord()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
	}
	
	@Test
	//69.1 - 69.5
	public void RecordWhileRecord()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
	}
	
	@Test
	//70.1 - 70.5
	public void EoTWhileRecord()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//71.1 - 71.5
	public void SoTWhileRecord()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.START_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//72.1 - 72.5
	public void EjectWhileRecord()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.EJECT));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//73.1 - 73.5
	public void PowerWhileRecord()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//74.1 - 74.5
	public void RewindWhileEoTRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//75.1 - 75.5
	public void StopWhileEoTRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.STOP));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//76.1 - 76.5
	public void PlayWhileEoTRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
	}
	
	@Test
	//77.1 - 77.5
	public void FwdWhileEoTRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
	}
	
	@Test
	//78.1 - 78.5
	public void ReverseWhileEoTRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//79.1 - 79.5
	public void CueWhileEoTRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.CUE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//80.1 - 80.5
	public void PauseWhileEoTRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		System.out.println(vcrMngr.getState().getClass().toString());
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//81.1 - 81.5
	public void RecordWhileEoTRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//82.1 - 82.5
	public void EoTWhileEoTRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//83.1 - 83.5
	public void SoTWhileEoTRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.START_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//84.1 - 84.5
	public void EjectWhileEoTRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.EJECT));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//85.1 - 85.5
	public void PowerWhileEoTRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//86.1 - 86.4
	public void SoTWhileIdle()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.START_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//87.1 - 87.4
	public void EjectWhileIdle()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.EJECT));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//88.1 - 88.4
	public void PowerWhileIdle()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//89.1 - 89.5
	public void StopWhilePause()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.STOP));

		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//90.1 - 90.5
	public void PlayWhilePauseAndRecording()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Pause);
	}
	
	@Test
	//91.1 - 91.5
	public void PlayWhilePauseAndNotRecording()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
	}
	
	@Test
	//92.1 - 92.5
	public void RewindWhilePauseAndRecording()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Pause);
	}
	
	@Test
	//93.1 - 93.5
	public void RewindWhilePauseAndNotRecording()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//94.1 - 94.5
	public void FwdWhilePauseAndRecording()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof Pause);
	}
	
	@Test
	//95.1 - 95.5
	public void FwdWhilePauseAndNotRecording()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
	}
	
	@Test
	//96.1 - 60.5
	public void ReverseWhilePauseAndRecording()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
	}
	
	@Test
	//97.1 - 97.5
	public void ReverseWhilePauseAndNotRecording()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
	}
	
	@Test
	//98.1 - 98.5
	public void CueWhilePauseAndRecording()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.CUE));
		assertTrue(vcrMngr.getState() instanceof Pause);
	}
	
	@Test
	//99.1 - 99.5
	public void CUEWhilePauseAndNotRecording()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.CUE));
		assertTrue(vcrMngr.getState() instanceof Cue);
	}
	
	@Test
	//100.1 - 100.5
	public void RecordWhilePauseAndRecording()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
	}
	
	@Test
	//101.1 - 101.5
	public void RecordWhilePauseAndNotRecording()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Pause);
	}
	
	@Test
	//102.1 - 102.5
	public void PauseWhilePauseAndRecording()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Record);
	}
	
	@Test
	//103.1 - 103.5
	public void PauseWhilePauseAndNotRecording()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Play);
	}
	
	@Test
	//104.1 - 104.5
	public void EoTWhilePause()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//105.1 - 105.5
	public void SoTWhilePause()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.START_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Idle);
	}
	
	@Test
	//106.1 - 106.5
	public void EjectWhilePause()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.EJECT));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//107.1 - 107.5
	public void PowerWhilePause()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() == NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//108.1 - 108.2
	public void InjectWhileOff()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);		
	}
	
	@Test
	//109.1 - 109.2
	public void PowerWhileOffTapeIn()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Off);
		assertTrue(vcrMngr.getTape() != NullDevice.getDefault());
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Idle);		
	}
	
	@Test
	//110.1 - 110.2
	public void OffWhileEmprty()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//SP 1.1 - 1.2
	public void PlayWhileOff()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//SP 2.1 - 2.2
	public void StopWhileOff()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.STOP));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//SP 3.1 - 3.2
	public void RewindWhileOff()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//SP 4.1 - 4.2
	public void FwdWhileOff()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//SP 5.1 - 5.2
	public void ReverseWhileOff()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//SP 6.1 - 6.2
	public void CUEWhileOff()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.CUE));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//SP 7.1 - 7.2
	public void PauseWhileOff()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//SP 8.1 - 8.2
	public void RecordWhileOff()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//SP 9.1 - 9.2
	public void EoTWhileOff()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//SP 10.1 - 10.2
	public void SoTWhileOff()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.START_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//SP 11.1 - 11.2
	public void EjectWhileOff()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.EJECT));
		assertTrue(vcrMngr.getState() instanceof Off);
	}
	
	@Test
	//SP 12.1 - 12.3
	public void PlayWhileEmpty()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
	
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//SP 12.3 - 13.3
	public void StopWhileEmpty()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		
		vcrMngr.processEvent(new VCREvent(VCREvent.STOP));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//SP 14.1 - 14.3
	public void RewindWhileEmpty()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//SP 15.1 - 15.3
	public void FwdWhileEmpty()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof Empty);
		
	}
	
	@Test
	//SP 16.1 - 16.2
	public void ReverseWhileEmpty()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//SP 17.1 - 17.3
	public void CueWhileEmpty()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
	
		vcrMngr.processEvent(new VCREvent(VCREvent.CUE));
		assertTrue(vcrMngr.getState() instanceof Empty);
		
	}
	
	@Test
	//SP 18.1 - 18.3
	public void RecordWhileEmpty()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//SP 19.1 - 19.3
	public void PauseWhileEmpty()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//SP 20.1 - 20.3
	public void EoTWhileEmpty()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.END_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//SP 21.1 - 21.3
	public void SoTWhileEmpty()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.START_OF_TAPE));
		assertTrue(vcrMngr.getState() instanceof Empty);
	}
	
	@Test
	//SP 22.1 - 22.3
	public void EjectWhileEmpty()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.EJECT));
		assertTrue(vcrMngr.getState() instanceof Empty);	
	}
	
	@Test
	//SP 23.1 - 23.2
	public void InjectWhileIdle()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);	
		
	}
	
	@Test
	//SP 24.1 - 24.2
	public void InjectWhilePlay()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PLAY));
		assertTrue(vcrMngr.getState() instanceof Play);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Play);
	}
	
	@Test
	//SP 25.1 - 25.2
	public void InjectWhileRewind()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REWIND));
		assertTrue(vcrMngr.getState() instanceof Rewind);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Rewind);
	}
	
	@Test
	//SP 26.1 - 26.2
	public void InjectWhileFWD()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.FWD));
		assertTrue(vcrMngr.getState() instanceof FWD);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof FWD);
	}
	
	@Test
	//SP 27.1 - 27.2
	public void InjectWhileReverse()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.REVERSE));
		assertTrue(vcrMngr.getState() instanceof Reverse);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Reverse);
	}
	
	@Test
	//SP 28.1 - 28.2
	public void InjectWhileCue()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.CUE));
		assertTrue(vcrMngr.getState() instanceof Cue);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Cue);
	}
	
	@Test
	//SP 29.1 - 29.2
	public void InjectWhileRecord()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.RECORD));
		assertTrue(vcrMngr.getState() instanceof Record);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Record);
	}
	
	@Test
	//SP 30.1 - 30.2
	public void InjectWhilePause()
	{
		VCRManager vcrMngr = new VCRManager();
		assertTrue(vcrMngr.getState() instanceof Off);
		vcrMngr.processEvent(new VCREvent(VCREvent.POWER));
		assertTrue(vcrMngr.getState() instanceof Empty);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Idle);
		vcrMngr.processEvent(new VCREvent(VCREvent.PAUSE));
		assertTrue(vcrMngr.getState() instanceof Pause);
		vcrMngr.processEvent(new VCREvent(VCREvent.INJECT));
		assertTrue(vcrMngr.getState() instanceof Pause);
	}
}
