package i8;

import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5450b;

    public /* synthetic */ m(Object obj, int i10) {
        this.f5449a = i10;
        this.f5450b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        View view2;
        int i11 = this.f5449a;
        Object obj = this.f5450b;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                nVar.getClass();
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                ArrayList arrayList = nVar.f5453c;
                if (arrayList.size() <= 1) {
                    return false;
                }
                if (i10 == 22) {
                    nVar.f5461k = (nVar.f5461k + 1) % arrayList.size();
                } else {
                    if (i10 != 21) {
                        return false;
                    }
                    nVar.f5461k = ((arrayList.size() + nVar.f5461k) - 1) % arrayList.size();
                }
                nVar.a((a8.b) arrayList.get(nVar.f5461k));
                Handler handler = nVar.f5454d;
                g.f fVar = nVar.f5455e;
                handler.removeCallbacks(fVar);
                handler.postDelayed(fVar, 6500L);
                return true;
            default:
                EditText editText = (EditText) obj;
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                if (i10 == 20) {
                    view2 = editText.focusSearch(130);
                } else if (i10 == 19) {
                    view2 = editText.focusSearch(33);
                } else {
                    if (i10 == 4) {
                        editText.clearFocus();
                        return true;
                    }
                    view2 = null;
                }
                if (view2 == null) {
                    return false;
                }
                view2.requestFocus();
                return true;
        }
    }
}
