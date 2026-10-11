package p8;

import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z3.e f8778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8779c;

    public /* synthetic */ i(z3.e eVar, Object obj, int i10) {
        this.f8777a = i10;
        this.f8778b = eVar;
        this.f8779c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f8777a;
        z3.e eVar = this.f8778b;
        Object obj = this.f8779c;
        switch (i10) {
            case 0:
                ((n8.a) eVar.f12044b).w((a8.e) obj);
                return;
            default:
                ((n8.a) eVar.f12044b).B((ImageView) obj);
                return;
        }
    }
}
