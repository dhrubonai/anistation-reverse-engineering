package l1;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6689a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6690b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6691c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6692d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6693e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6694f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6695g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6696h;

    /* renamed from: i, reason: collision with root package name */
    public String f6697i;

    public m0() {
        this.f6692d = new HashSet();
        this.f6696h = new HashMap();
    }

    public final GoogleSignInOptions a() {
        Object obj = this.f6692d;
        Set set = (Set) obj;
        if (set.contains(GoogleSignInOptions.F)) {
            Scope scope = GoogleSignInOptions.E;
            if (set.contains(scope)) {
                set.remove(scope);
            }
        }
        if (this.f6691c && (((Account) this.f6694f) == null || !set.isEmpty())) {
            ((Set) obj).add(GoogleSignInOptions.D);
        }
        return new GoogleSignInOptions(3, new ArrayList(set), (Account) this.f6694f, this.f6691c, this.f6689a, this.f6690b, (String) this.f6693e, (String) this.f6695g, (Map) this.f6696h, this.f6697i);
    }

    public m0(GoogleSignInOptions googleSignInOptions) {
        this.f6692d = new HashSet();
        this.f6696h = new HashMap();
        w7.b.s(googleSignInOptions);
        this.f6692d = new HashSet(googleSignInOptions.f2333b);
        this.f6689a = googleSignInOptions.f2336e;
        this.f6690b = googleSignInOptions.f2337f;
        this.f6691c = googleSignInOptions.f2335d;
        this.f6693e = googleSignInOptions.f2338x;
        this.f6694f = googleSignInOptions.f2334c;
        this.f6695g = googleSignInOptions.f2339y;
        this.f6696h = GoogleSignInOptions.e(googleSignInOptions.f2340z);
        this.f6697i = googleSignInOptions.A;
    }

    public m0(Context context) {
        this.f6692d = context;
        this.f6693e = e.f6644c;
        this.f6695g = l0.f6685a;
    }
}
