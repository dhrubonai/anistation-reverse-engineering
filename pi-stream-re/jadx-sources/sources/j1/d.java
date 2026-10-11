package j1;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f5656a;

    /* renamed from: b, reason: collision with root package name */
    public final b f5657b;

    /* renamed from: c, reason: collision with root package name */
    public c f5658c;

    /* renamed from: d, reason: collision with root package name */
    public c1.g f5659d;

    /* renamed from: e, reason: collision with root package name */
    public int f5660e;

    /* renamed from: f, reason: collision with root package name */
    public int f5661f;

    /* renamed from: g, reason: collision with root package name */
    public float f5662g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f5663h;

    public d(Context context, Handler handler, z zVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f5656a = audioManager;
        this.f5658c = zVar;
        this.f5657b = new b(this, handler);
        this.f5660e = 0;
    }

    public final void a() {
        if (this.f5660e == 0) {
            return;
        }
        int i10 = f1.b0.f3799a;
        AudioManager audioManager = this.f5656a;
        if (i10 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f5663h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f5657b);
        }
        d(0);
    }

    public final void b(int i10) {
        c cVar = this.f5658c;
        if (cVar != null) {
            d0 d0Var = ((z) cVar).f5932a;
            boolean E = d0Var.E();
            int i11 = 1;
            if (E && i10 != 1) {
                i11 = 2;
            }
            d0Var.d0(i10, i11, E);
        }
    }

    public final void c() {
        if (!f1.b0.a(this.f5659d, null)) {
            this.f5659d = null;
            this.f5661f = 0;
        }
    }

    public final void d(int i10) {
        float f10;
        if (this.f5660e == i10) {
            return;
        }
        this.f5660e = i10;
        if (i10 == 3) {
            f10 = 0.2f;
        } else {
            f10 = 1.0f;
        }
        if (this.f5662g == f10) {
            return;
        }
        this.f5662g = f10;
        c cVar = this.f5658c;
        if (cVar != null) {
            d0 d0Var = ((z) cVar).f5932a;
            d0Var.S(Float.valueOf(d0Var.Y * d0Var.f5696z.f5662g), 1, 2);
        }
    }

    public final int e(int i10, boolean z9) {
        boolean z10;
        int requestAudioFocus;
        AudioFocusRequest.Builder i11;
        boolean z11;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int i12 = 1;
        if (i10 != 1 && this.f5661f == 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            a();
            if (z9) {
                return 1;
            }
            return -1;
        }
        if (!z9) {
            return -1;
        }
        if (this.f5660e != 1) {
            int i13 = f1.b0.f3799a;
            b bVar = this.f5657b;
            AudioManager audioManager = this.f5656a;
            if (i13 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f5663h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        h0.f.m();
                        i11 = h0.f.e(this.f5661f);
                    } else {
                        h0.f.m();
                        i11 = h0.f.i(this.f5663h);
                    }
                    c1.g gVar = this.f5659d;
                    if (gVar != null && gVar.f1696a == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    gVar.getClass();
                    audioAttributes = i11.setAudioAttributes((AudioAttributes) gVar.a().f3762b);
                    willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z11);
                    onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(bVar);
                    build = onAudioFocusChangeListener.build();
                    this.f5663h = build;
                }
                requestAudioFocus = audioManager.requestAudioFocus(this.f5663h);
            } else {
                c1.g gVar2 = this.f5659d;
                gVar2.getClass();
                requestAudioFocus = audioManager.requestAudioFocus(bVar, f1.b0.B(gVar2.f1698c), this.f5661f);
            }
            if (requestAudioFocus == 1) {
                d(1);
            } else {
                d(0);
                i12 = -1;
            }
        }
        return i12;
    }
}
