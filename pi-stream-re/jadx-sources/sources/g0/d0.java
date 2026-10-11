package g0;

import android.view.View;

/* loaded from: classes.dex */
public final class d0 extends f0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4176e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i10, int i11) {
        super(i10, Boolean.class, 0, 28);
        this.f4176e = i11;
    }

    public final Boolean d(View view) {
        switch (this.f4176e) {
            case 0:
                return Boolean.valueOf(r0.d(view));
            default:
                return Boolean.valueOf(r0.c(view));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i10, int i11, int i12, int i13) {
        super(i10, CharSequence.class, i11, i12);
        this.f4176e = i13;
    }
}
