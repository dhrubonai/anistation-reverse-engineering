package l1;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* loaded from: classes.dex */
public abstract class a {
    private static r6.t0 a() {
        r6.s0 s0Var = new r6.s0();
        Integer[] numArr = {8, 7};
        r6.h0.o(2, numArr);
        s0Var.B0(s0Var.f9479d + 2);
        System.arraycopy(numArr, 0, s0Var.f9478c, s0Var.f9479d, 2);
        s0Var.f9479d += 2;
        int i10 = f1.b0.f3799a;
        if (i10 >= 31) {
            Integer[] numArr2 = {26, 27};
            r6.h0.o(2, numArr2);
            s0Var.B0(s0Var.f9479d + 2);
            System.arraycopy(numArr2, 0, s0Var.f9478c, s0Var.f9479d, 2);
            s0Var.f9479d += 2;
        }
        if (i10 >= 33) {
            s0Var.C0(30);
        }
        return s0Var.D0();
    }

    public static boolean b(AudioManager audioManager, i iVar) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        if (iVar == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{iVar.f6671a};
        }
        r6.t0 a10 = a();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (a10.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
