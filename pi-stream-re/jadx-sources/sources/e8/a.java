package e8;

import a8.e;
import a8.h;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import r6.h0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c8.b f3594a;

    public a(c8.b bVar) {
        this.f3594a = bVar;
    }

    public final List a(String str) {
        List M;
        try {
            c8.b bVar = this.f3594a;
            bVar.getClass();
            if (str != null && !str.isEmpty()) {
                try {
                    JSONObject d10 = bVar.f2082a.d(str);
                    if (d10 == null) {
                        M = Collections.emptyList();
                    } else {
                        M = h0.M(d10);
                    }
                    return M;
                } catch (Exception e10) {
                    Log.e("PrimaryClient", "movieBoxDubs", e10);
                    return Collections.emptyList();
                }
            }
            return Collections.emptyList();
        } catch (Exception e11) {
            Log.e("AnimeRepository", "dubs failed", e11);
            return Collections.emptyList();
        }
    }

    public final boolean b(h hVar) {
        String str;
        String str2;
        this.f3594a.getClass();
        if (hVar == null) {
            return false;
        }
        String str3 = hVar.f200c;
        String str4 = "";
        if (str3 == null) {
            str = "";
        } else {
            str = str3.toLowerCase(Locale.US);
        }
        String str5 = hVar.f201d;
        if (str5 == null) {
            str2 = "";
        } else {
            str2 = str5.toLowerCase(Locale.US);
        }
        String str6 = hVar.f198a;
        if (str6 != null) {
            str4 = str6.toLowerCase(Locale.US);
        }
        if (!str.contains("dub") && !str2.contains("dub") && !str4.contains("dub")) {
            return false;
        }
        return true;
    }

    public final List c(e eVar, String str) {
        try {
            c8.b bVar = this.f3594a;
            bVar.getClass();
            try {
                d2.a l10 = c8.b.l(eVar, str);
                return bVar.g(l10.f3089b, l10.f3090c, l10.f3088a);
            } catch (Exception e10) {
                Log.e("PrimaryClient", "moviebox web topup", e10);
                return Collections.emptyList();
            }
        } catch (Exception e11) {
            Log.e("AnimeRepository", "web topup failed", e11);
            return Collections.emptyList();
        }
    }
}
