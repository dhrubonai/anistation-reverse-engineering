package n8;

import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8041b;

    public /* synthetic */ m(Object obj, int i10) {
        this.f8040a = i10;
        this.f8041b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8040a;
        Object obj = this.f8041b;
        switch (i10) {
            case 0:
                ((LinearLayout) obj).requestFocus();
                return;
            case 1:
                ((LinearLayout) obj).requestFocus();
                return;
            default:
                ((a) obj).a();
                return;
        }
    }
}
