package h8;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f5108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5109c;

    public /* synthetic */ u(x xVar, int i10, int i11) {
        this.f5107a = i11;
        this.f5108b = xVar;
        this.f5109c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12 = this.f5107a;
        int i13 = this.f5109c;
        x xVar = this.f5108b;
        switch (i12) {
            case 0:
                Context context = xVar.f5121b;
                if (i13 == 0) {
                    i10 = com.bumptech.glide.c.v(context);
                } else {
                    i10 = i13;
                }
                if (i13 == 0) {
                    i11 = 0;
                } else {
                    i11 = i10;
                }
                xVar.f5126g = i11;
                if (i13 > 0) {
                    com.bumptech.glide.c.b0(context).edit().putInt("download_quality", i10).apply();
                }
                xVar.g();
                return;
            default:
                xVar.f5127h = i13;
                xVar.j();
                return;
        }
    }
}
