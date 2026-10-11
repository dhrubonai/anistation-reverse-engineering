package g;

import android.graphics.drawable.Animatable;

/* loaded from: classes.dex */
public final class a extends q6.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4119c;

    /* renamed from: d, reason: collision with root package name */
    public final Animatable f4120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Animatable animatable, int i10) {
        super(0);
        this.f4119c = i10;
        this.f4120d = animatable;
    }

    @Override // q6.g
    public final void m0() {
        int i10 = this.f4119c;
        Animatable animatable = this.f4120d;
        switch (i10) {
            case 0:
                animatable.start();
                return;
            default:
                ((r3.d) animatable).start();
                return;
        }
    }

    @Override // q6.g
    public final void n0() {
        int i10 = this.f4119c;
        Animatable animatable = this.f4120d;
        switch (i10) {
            case 0:
                animatable.stop();
                return;
            default:
                ((r3.d) animatable).stop();
                return;
        }
    }
}
