package b4;

import android.content.ContentResolver;

/* loaded from: classes.dex */
public final class g0 implements y, h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1460a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f1461b;

    public /* synthetic */ g0(ContentResolver contentResolver, int i10) {
        this.f1460a = i10;
        this.f1461b = contentResolver;
    }

    @Override // b4.y
    public final x j(c0 c0Var) {
        switch (this.f1460a) {
            case 0:
                return new i0(this);
            case 1:
                return new i0(this);
            default:
                return new i0(this);
        }
    }
}
