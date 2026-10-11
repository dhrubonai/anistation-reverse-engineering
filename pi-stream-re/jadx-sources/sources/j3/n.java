package j3;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6043c;

    public /* synthetic */ n(Object obj, int i10, int i11) {
        this.f6041a = i11;
        this.f6043c = obj;
        this.f6042b = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f6041a;
        int i11 = this.f6042b;
        Object obj = this.f6043c;
        switch (i10) {
            case 0:
                o oVar = (o) obj;
                int i12 = oVar.f6071f;
                x xVar = oVar.f6072g;
                if (i11 != i12) {
                    xVar.setPlaybackSpeed(oVar.f6070e[i11]);
                }
                xVar.B.dismiss();
                return;
            default:
                m8.h hVar = (m8.h) obj;
                hVar.f7607e.remove(i11);
                hVar.i();
                return;
        }
    }
}
