package i8;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f5429g = {"Home", "My List", "Download", "Profile"};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f5430h = {R.drawable.ic_home, R.drawable.ic_my_list, R.drawable.ic_download_fill, R.drawable.ic_profile};

    /* renamed from: a, reason: collision with root package name */
    public final Context f5431a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5432b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5433c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f5434d = 0;

    /* renamed from: e, reason: collision with root package name */
    public View f5435e;

    /* renamed from: f, reason: collision with root package name */
    public LinearLayout f5436f;

    public f(Context context) {
        this.f5431a = context;
    }

    public final void a(int i10) {
        int i11;
        this.f5434d = i10;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f5432b;
            if (i12 < arrayList.size()) {
                if (i12 == this.f5434d) {
                    i11 = w8.i.f11065e;
                } else {
                    i11 = w8.i.f11068h;
                }
                ((ImageView) arrayList.get(i12)).setColorFilter(i11);
                ((TextView) this.f5433c.get(i12)).setTextColor(i11);
                i12++;
            } else {
                return;
            }
        }
    }
}
