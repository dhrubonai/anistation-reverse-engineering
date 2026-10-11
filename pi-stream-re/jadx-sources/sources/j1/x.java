package j1;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class x {
    public static boolean a(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
        boolean z9;
        if (f1.b0.f3799a >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return true;
        }
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                return true;
            }
            int i10 = f1.b0.f3799a;
            if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                return true;
            }
            if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                return true;
            }
            if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                return true;
            }
            if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                return true;
            }
        }
        return false;
    }

    public static void b(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
    }
}
