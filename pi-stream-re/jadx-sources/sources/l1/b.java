package l1;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import r6.d2;
import r6.q1;
import r6.r1;
import r6.s1;

/* loaded from: classes.dex */
public abstract class b {
    public static r6.o0 a(c1.g gVar) {
        boolean isDirectPlaybackSupported;
        r6.m0 m0Var = r6.o0.f9505b;
        r6.l0 l0Var = new r6.l0();
        s1 s1Var = e.f6646e;
        q1 q1Var = s1Var.f9524b;
        if (q1Var == null) {
            q1 q1Var2 = new q1(s1Var, new r1(s1Var.f9533e, 0, s1Var.f9534f));
            s1Var.f9524b = q1Var2;
            q1Var = q1Var2;
        }
        d2 it = q1Var.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (f1.b0.f3799a >= f1.b0.o(intValue)) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), (AudioAttributes) gVar.a().f3762b);
                if (isDirectPlaybackSupported) {
                    l0Var.x0(Integer.valueOf(intValue));
                }
            }
        }
        l0Var.x0(2);
        return l0Var.C0();
    }

    public static int b(int i10, int i11, c1.g gVar) {
        boolean isDirectPlaybackSupported;
        for (int i12 = 10; i12 > 0; i12--) {
            int q9 = f1.b0.q(i12);
            if (q9 != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(q9).build(), (AudioAttributes) gVar.a().f3762b);
                if (isDirectPlaybackSupported) {
                    return i12;
                }
            }
        }
        return 0;
    }
}
