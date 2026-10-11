package j3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import m3.a1;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class o extends m3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final String[] f6069d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f6070e;

    /* renamed from: f, reason: collision with root package name */
    public int f6071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f6072g;

    public o(x xVar, String[] strArr, float[] fArr) {
        this.f6072g = xVar;
        this.f6069d = strArr;
        this.f6070e = fArr;
    }

    @Override // m3.d0
    public final int a() {
        return this.f6069d.length;
    }

    @Override // m3.d0
    public final void c(a1 a1Var, int i10) {
        s sVar = (s) a1Var;
        String[] strArr = this.f6069d;
        if (i10 < strArr.length) {
            sVar.f6084u.setText(strArr[i10]);
        }
        int i11 = this.f6071f;
        View view = sVar.f6085v;
        View view2 = sVar.f7153a;
        int i12 = 0;
        if (i10 == i11) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new n(this, i10, i12));
    }

    @Override // m3.d0
    public final a1 d(RecyclerView recyclerView) {
        return new s(LayoutInflater.from(this.f6072g.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, (ViewGroup) recyclerView, false));
    }
}
