package j3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c1.f1;
import c1.z0;
import java.util.ArrayList;
import java.util.List;
import m3.a1;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public abstract class v extends m3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public List f6102d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f6103e;

    public v(x xVar) {
        this.f6103e = xVar;
    }

    @Override // m3.d0
    public final int a() {
        if (this.f6102d.isEmpty()) {
            return 0;
        }
        return this.f6102d.size() + 1;
    }

    @Override // m3.d0
    public final a1 d(RecyclerView recyclerView) {
        return new s(LayoutInflater.from(this.f6103e.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, (ViewGroup) recyclerView, false));
    }

    public void e(s sVar, int i10) {
        z0 z0Var = this.f6103e.f6136y0;
        if (z0Var == null) {
            return;
        }
        boolean z9 = true;
        View view = sVar.f7153a;
        View view2 = sVar.f6085v;
        TextView textView = sVar.f6084u;
        int i11 = 4;
        int i12 = 0;
        if (i10 == 0) {
            k kVar = (k) this;
            switch (kVar.f6029f) {
                case 0:
                    textView.setText(R.string.exo_track_selection_auto);
                    z0 z0Var2 = kVar.f6030g.f6136y0;
                    z0Var2.getClass();
                    if (!kVar.f(((j1.d0) z0Var2).I())) {
                        i11 = 0;
                    }
                    view2.setVisibility(i11);
                    view.setOnClickListener(new j(kVar, i12));
                    return;
                default:
                    textView.setText(R.string.exo_track_selection_none);
                    int i13 = 0;
                    while (true) {
                        if (i13 < kVar.f6102d.size()) {
                            t tVar = (t) kVar.f6102d.get(i13);
                            if (tVar.f6086a.f1805e[tVar.f6087b]) {
                                z9 = false;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z9) {
                        i11 = 0;
                    }
                    view2.setVisibility(i11);
                    view.setOnClickListener(new j(kVar, 2));
                    return;
            }
        }
        t tVar2 = (t) this.f6102d.get(i10 - 1);
        f1 f1Var = tVar2.f6086a.f1802b;
        if (((j1.d0) z0Var).I().A.get(f1Var) == null || !tVar2.f6086a.f1805e[tVar2.f6087b]) {
            z9 = false;
        }
        textView.setText(tVar2.f6088c);
        if (z9) {
            i11 = 0;
        }
        view2.setVisibility(i11);
        view.setOnClickListener(new u(this, z0Var, f1Var, tVar2, 0));
    }
}
