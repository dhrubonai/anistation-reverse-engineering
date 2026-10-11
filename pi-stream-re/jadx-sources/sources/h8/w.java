package h8;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5114a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5116c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5119f;

    public /* synthetic */ w(x xVar, int i10, a8.b bVar, int i11, String str) {
        this.f5118e = xVar;
        this.f5115b = i10;
        this.f5119f = bVar;
        this.f5116c = i11;
        this.f5117d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i10 = this.f5114a;
        int i11 = this.f5116c;
        String str2 = this.f5117d;
        int i12 = this.f5115b;
        Object obj = this.f5118e;
        switch (i10) {
            case 0:
                x xVar = (x) obj;
                xVar.f5143y = false;
                AlertDialog alertDialog = xVar.f5142x;
                if (alertDialog != null && alertDialog.isShowing()) {
                    xVar.f5142x.dismiss();
                }
                Context context = xVar.f5121b;
                if (i12 > 0) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(w8.i.e(context, 24), w8.i.e(context, 16), w8.i.e(context, 24), w8.i.e(context, 24));
                    StringBuilder sb = new StringBuilder("Queued ");
                    sb.append(i12);
                    sb.append(" download");
                    String str3 = "";
                    if (i12 == 1) {
                        str = "";
                    } else {
                        str = "s";
                    }
                    sb.append(str);
                    TextView l10 = w8.i.l(context, sb.toString(), 18, -1, 1);
                    l10.setGravity(17);
                    r.f.i(-1, -2, linearLayout, l10);
                    if (i11 > 0) {
                        StringBuilder u9 = a3.g.u("", i11, " failed");
                        if (!str2.isEmpty()) {
                            str3 = ": ".concat(str2);
                        }
                        u9.append(str3);
                        str3 = u9.toString();
                    }
                    if (!str3.isEmpty()) {
                        TextView l11 = w8.i.l(context, str3, 14, w8.i.f11068h, 0);
                        LinearLayout.LayoutParams c6 = r.f.c(l11, 17, -1, -2);
                        c6.setMargins(0, w8.i.e(context, 8), 0, 0);
                        linearLayout.addView(l11, c6);
                    }
                    TextView i13 = w8.i.i(context, "View downloads", true);
                    i13.setGravity(17);
                    w8.i.d(i13);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, w8.i.e(context, 52));
                    layoutParams.setMargins(0, w8.i.e(context, 18), 0, 0);
                    linearLayout.addView(i13, layoutParams);
                    TextView l12 = w8.i.l(context, "Close", 15, w8.i.f11068h, 1);
                    l12.setGravity(17);
                    linearLayout.addView(l12, new LinearLayout.LayoutParams(-1, w8.i.e(context, 48)));
                    AlertDialog create = new AlertDialog.Builder(context, R.style.BottomSheetDialogTheme).setView(linearLayout).create();
                    w8.i.k(context, create, true);
                    l12.setOnClickListener(new g(create, 1));
                    i13.setOnClickListener(new r(4, xVar, create));
                    create.show();
                    return;
                }
                Toast.makeText(context, "Download failed: " + str2, 1).show();
                return;
            default:
                v8.b.a((v8.b) obj, i12, i11, str2, (PopupWindow) this.f5119f);
                return;
        }
    }

    public /* synthetic */ w(v8.b bVar, int i10, int i11, String str, PopupWindow popupWindow) {
        this.f5118e = bVar;
        this.f5115b = i10;
        this.f5116c = i11;
        this.f5117d = str;
        this.f5119f = popupWindow;
    }
}
