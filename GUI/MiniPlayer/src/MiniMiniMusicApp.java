import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args){
            MiniMiniMusicApp mini = new MiniMiniMusicApp();
            mini.play();
    }
    public void play(){
        try{
            Sequencer player = MidiSystem.getSequencer();
            player.open(); // have to open the sequencer first

            Sequence seq = new Sequence(Sequence.PPQ,4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,44,100);
            // 144 = noteOn (start playing)
            // 1 = channel (ie. 1= piano, 2 = drum)
            // 44 = the note to play (0 softest -127 hardest)
            // 100 = velocity (how hard to play )

            MidiEvent noteOn = new MidiEvent(a,1);
            // 1 = tick (duration of the note)
            track.add(noteOn);


            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,44,100);
            // 128 = noteOff (stop playing)
            MidiEvent noteOff = new MidiEvent(b,16);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
