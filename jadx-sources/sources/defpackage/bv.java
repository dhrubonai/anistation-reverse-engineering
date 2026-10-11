package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bv {
    public final r26 a;
    public final Handler b;
    public fz1 c;
    public ru d;
    public int f;
    public cv h;
    public float g = 1.0f;
    public byte e = 0;

    public bv(Context context, Looper looper, fz1 fz1Var) {
        this.a = mv5.e(new av(context, (byte) 0));
        this.c = fz1Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        byte b = this.e;
        if (b != 1 && b != 0 && this.h != null) {
            AudioManager audioManager = (AudioManager) this.a.get();
            AudioFocusRequest audioFocusRequest = this.h.f;
            audioFocusRequest.getClass();
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        float f;
        if (this.e != i) {
            this.e = i;
            if (i == 4) {
                f = 0.2f;
            } else {
                f = 1.0f;
            }
            if (this.g != f) {
                this.g = f;
                fz1 fz1Var = this.c;
                if (fz1Var != null) {
                    fz1Var.D.j(34);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [mm5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [mm5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [zu] */
    public final int c(int i, boolean z) {
        int i2;
        mm5 mm5Var;
        boolean z2;
        if (i != 1 && (i2 = this.f) == 1) {
            byte b = this.e;
            if (z) {
                if (b != 2) {
                    cv cvVar = this.h;
                    if (cvVar == null) {
                        if (cvVar == null) {
                            ?? obj = new Object();
                            ru ruVar = ru.i;
                            obj.x = i2;
                            mm5Var = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.x = cvVar.a;
                            mm5Var = obj2;
                        }
                        ru ruVar2 = this.d;
                        if (ruVar2 != null && ruVar2.a == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ruVar2.getClass();
                        this.h = new cv(mm5Var.x, new AudioManager.OnAudioFocusChangeListener() { // from class: zu
                            @Override // android.media.AudioManager.OnAudioFocusChangeListener
                            public final void onAudioFocusChange(int i3) {
                                ru ruVar3;
                                bv bvVar = bv.this;
                                bvVar.getClass();
                                if (i3 != -3 && i3 != -2) {
                                    if (i3 != -1) {
                                        if (i3 != 1) {
                                            h11.r(i3, "Unknown focus change type: ", "AudioFocusManager");
                                            return;
                                        }
                                        bvVar.b(2);
                                        fz1 fz1Var = bvVar.c;
                                        if (fz1Var != null) {
                                            fz1Var.D.b(33, 1, 0).b();
                                            return;
                                        }
                                        return;
                                    }
                                    fz1 fz1Var2 = bvVar.c;
                                    if (fz1Var2 != null) {
                                        fz1Var2.D.b(33, -1, 0).b();
                                    }
                                    bvVar.a();
                                    bvVar.b(1);
                                    return;
                                }
                                if (i3 != -2 && ((ruVar3 = bvVar.d) == null || ruVar3.a != 1)) {
                                    bvVar.b(4);
                                    return;
                                }
                                fz1 fz1Var3 = bvVar.c;
                                if (fz1Var3 != null) {
                                    fz1Var3.D.b(33, 0, 0).b();
                                }
                                bvVar.b(3);
                            }
                        }, this.b, ruVar2, z2, true);
                    }
                    AudioManager audioManager = (AudioManager) this.a.get();
                    AudioFocusRequest audioFocusRequest = this.h.f;
                    audioFocusRequest.getClass();
                    int requestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
                    if (requestAudioFocus != 1 && requestAudioFocus != 2) {
                        b(1);
                        return -1;
                    }
                    b(2);
                    return 1;
                }
            } else {
                if (b == 1) {
                    return -1;
                }
                if (b == 3) {
                    return 0;
                }
            }
            return 1;
        }
        a();
        b(0);
        return 1;
    }
}
