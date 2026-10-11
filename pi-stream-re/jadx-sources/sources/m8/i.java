package m8;

import android.view.View;
import android.widget.LinearLayout;
import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z3.e f7623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f7624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f7625d;

    public /* synthetic */ i(z3.e eVar, LinearLayout linearLayout, File file, int i10) {
        this.f7622a = i10;
        this.f7623b = eVar;
        this.f7625d = linearLayout;
        this.f7624c = file;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f7622a;
        File file = this.f7624c;
        LinearLayout linearLayout = this.f7625d;
        z3.e eVar = this.f7623b;
        switch (i10) {
            case 0:
                eVar.F(linearLayout, file);
                return;
            case 1:
                eVar.getClass();
                file.delete();
                eVar.i(linearLayout);
                return;
            default:
                eVar.F(linearLayout, file);
                return;
        }
    }

    public /* synthetic */ i(z3.e eVar, File file, LinearLayout linearLayout) {
        this.f7622a = 1;
        this.f7623b = eVar;
        this.f7624c = file;
        this.f7625d = linearLayout;
    }
}
