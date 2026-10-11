package a5;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import msr.pistream.app.download.PiStreamDownloadService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f94c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static b f95d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f96a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f97b;

    public b(Context context) {
        this.f97b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        w7.b.s(context);
        ReentrantLock reentrantLock = f94c;
        reentrantLock.lock();
        try {
            if (f95d == null) {
                f95d = new b(context.getApplicationContext());
            }
            return f95d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String g(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public final GoogleSignInAccount b() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e11) && (e10 = e(g("googleSignInAccount", e11))) != null) {
            try {
                return GoogleSignInAccount.d(e10);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions c() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e11) || (e10 = e(g("googleSignInOptions", e11))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.d(e10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        w7.b.s(googleSignInOptions);
        String str = googleSignInAccount.f2331z;
        f("defaultGoogleSignInAccount", str);
        String g10 = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f2324b;
            if (str2 != null) {
                jSONObject.put(PiStreamDownloadService.EXTRA_ID, str2);
            }
            String str3 = googleSignInAccount.f2325c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f2326d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f2327e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.B;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.C;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f2328f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f2329x;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f2330y);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.A;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, z4.b.f12057a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f2355b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            f(g10, jSONObject.toString());
            String g11 = g("googleSignInOptions", str);
            String str9 = googleSignInOptions.f2339y;
            String str10 = googleSignInOptions.f2338x;
            ArrayList arrayList = googleSignInOptions.f2333b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList, GoogleSignInOptions.G);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f2355b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f2334c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f2335d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f2337f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f2336e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                f(g11, jSONObject2.toString());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f96a;
        reentrantLock.lock();
        try {
            return this.f97b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(String str, String str2) {
        ReentrantLock reentrantLock = this.f96a;
        reentrantLock.lock();
        try {
            this.f97b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
