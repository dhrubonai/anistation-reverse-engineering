package f;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.w0;

/* loaded from: classes.dex */
public final class d implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3643c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f3641a = i10;
        this.f3643c = obj;
        this.f3642b = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j4) {
        int i11 = this.f3641a;
        Object obj = this.f3643c;
        switch (i11) {
            case 0:
                e eVar = (e) obj;
                DialogInterface.OnClickListener onClickListener = eVar.f3657l;
                h hVar = (h) this.f3642b;
                onClickListener.onClick(hVar.f3705b, i10);
                if (!eVar.f3659n) {
                    hVar.f3705b.dismiss();
                    return;
                }
                return;
            default:
                androidx.appcompat.widget.t0 t0Var = (androidx.appcompat.widget.t0) obj;
                t0Var.Y.setSelection(i10);
                w0 w0Var = t0Var.Y;
                if (w0Var.getOnItemClickListener() != null) {
                    w0Var.performItemClick(view, i10, t0Var.V.getItemId(i10));
                }
                t0Var.dismiss();
                return;
        }
    }
}
