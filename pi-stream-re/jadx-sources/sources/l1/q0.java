package l1;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final AudioTrack f6729a;

    /* renamed from: b, reason: collision with root package name */
    public final h f6730b;

    /* renamed from: c, reason: collision with root package name */
    public p0 f6731c = new AudioRouting.OnRoutingChangedListener() { // from class: l1.p0
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            q0.this.b(audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [l1.p0] */
    public q0(AudioTrack audioTrack, h hVar) {
        this.f6729a = audioTrack;
        this.f6730b = hVar;
        audioTrack.addOnRoutingChangedListener(this.f6731c, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        AudioDeviceInfo routedDevice2;
        if (this.f6731c != null) {
            routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null) {
                h hVar = this.f6730b;
                routedDevice2 = audioRouting.getRoutedDevice();
                hVar.b(routedDevice2);
            }
        }
    }

    public void c() {
        p0 p0Var = this.f6731c;
        p0Var.getClass();
        this.f6729a.removeOnRoutingChangedListener(f1.z.c(p0Var));
        this.f6731c = null;
    }
}
