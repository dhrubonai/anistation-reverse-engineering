package h8;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.function.BiConsumer;
import java.util.function.IntConsumer;
import m8.k0;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5019a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5021c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5023e;

    public /* synthetic */ b0(int i10, TextView textView, String str, int[] iArr) {
        this.f5020b = i10;
        this.f5021c = iArr;
        this.f5022d = textView;
        this.f5023e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int parseInt;
        int i10 = this.f5019a;
        int i11 = 0;
        int i12 = this.f5020b;
        Object obj = this.f5023e;
        Object obj2 = this.f5022d;
        Object obj3 = this.f5021c;
        switch (i10) {
            case 0:
                int[] iArr = (int[]) obj3;
                TextView textView = (TextView) obj2;
                String str = (String) obj;
                if (i12 <= 0 || iArr[0] < i12) {
                    iArr[0] = iArr[0] + 1;
                    textView.setText(iArr[0] + str);
                    return;
                }
                return;
            case 1:
                IntConsumer intConsumer = (IntConsumer) obj2;
                AlertDialog alertDialog = (AlertDialog) obj;
                String trim = ((EditText) obj3).getText().toString().trim();
                if (trim.isEmpty()) {
                    parseInt = 0;
                } else {
                    parseInt = Integer.parseInt(trim);
                }
                if (parseInt >= 0) {
                    i11 = parseInt;
                }
                if (i12 <= 0 || i11 <= i12) {
                    i12 = i11;
                }
                intConsumer.accept(i12);
                alertDialog.dismiss();
                return;
            default:
                ((AlertDialog) obj3).dismiss();
                ((BiConsumer) obj2).accept(Integer.valueOf(i12), (String) obj);
                return;
        }
    }

    public /* synthetic */ b0(AlertDialog alertDialog, BiConsumer biConsumer, int i10, String str) {
        this.f5021c = alertDialog;
        this.f5022d = biConsumer;
        this.f5020b = i10;
        this.f5023e = str;
    }

    public /* synthetic */ b0(EditText editText, int i10, k0 k0Var, AlertDialog alertDialog) {
        this.f5021c = editText;
        this.f5020b = i10;
        this.f5022d = k0Var;
        this.f5023e = alertDialog;
    }
}
