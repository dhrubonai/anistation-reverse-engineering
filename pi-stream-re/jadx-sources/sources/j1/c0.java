package j1;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* loaded from: classes.dex */
public final class c0 extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5655b;

    public /* synthetic */ c0(Object obj, int i10) {
        this.f5654a = i10;
        this.f5655b = obj;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        int i10 = this.f5654a;
        Object obj = this.f5655b;
        switch (i10) {
            case 0:
                d0 d0Var = (d0) obj;
                if (d0Var.K()) {
                    b1 b1Var = d0Var.f5675f0;
                    if (b1Var.f5648m == 3) {
                        d0Var.f0(1, 0, b1Var.f5647l);
                        return;
                    }
                    return;
                }
                return;
            default:
                l1.h hVar = (l1.h) obj;
                hVar.a(l1.e.c(hVar.f6660a, hVar.f6668i, hVar.f6667h));
                return;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        int i10 = this.f5654a;
        Object obj = this.f5655b;
        switch (i10) {
            case 0:
                d0 d0Var = (d0) obj;
                if (!d0Var.K()) {
                    d0Var.f0(1, 3, d0Var.f5675f0.f5647l);
                    return;
                }
                return;
            default:
                l1.h hVar = (l1.h) obj;
                if (f1.b0.j(audioDeviceInfoArr, hVar.f6667h)) {
                    hVar.f6667h = null;
                }
                hVar.a(l1.e.c(hVar.f6660a, hVar.f6668i, hVar.f6667h));
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(l1.h hVar) {
        this(hVar, 1);
        this.f5654a = 1;
    }
}
