package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.internal.p002firebaseauthapi.zzxv;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorGenerator;
import com.google.firebase.auth.TotpMultiFactorInfo;
import e5.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w7.b;

/* loaded from: classes.dex */
public final class zzby {
    private Context zza;
    private String zzb;
    private SharedPreferences zzc;
    private a zzd;

    public zzby(Context context, String str) {
        b.s(context);
        b.o(str);
        this.zzb = str;
        this.zza = context.getApplicationContext();
        this.zzc = this.zza.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.zzb), 0);
        this.zzd = new a("StorageHelpers", new String[0]);
    }

    private final String zzc(FirebaseUser firebaseUser) {
        JSONObject jSONObject = new JSONObject();
        if (zzaf.class.isAssignableFrom(firebaseUser.getClass())) {
            zzaf zzafVar = (zzaf) firebaseUser;
            try {
                jSONObject.put("cachedTokenState", zzafVar.zze());
                jSONObject.put("applicationName", zzafVar.zza().getName());
                jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                if (zzafVar.zzi() != null) {
                    JSONArray jSONArray = new JSONArray();
                    List<zzab> zzi = zzafVar.zzi();
                    int size = zzi.size();
                    if (zzi.size() > 30) {
                        this.zzd.f("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(zzi.size()));
                        size = 30;
                    }
                    boolean z9 = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        zzab zzabVar = zzi.get(i10);
                        if (zzabVar.getProviderId().equals(FirebaseAuthProvider.PROVIDER_ID)) {
                            z9 = true;
                        }
                        if (i10 == size - 1 && !z9) {
                            break;
                        }
                        jSONArray.put(zzabVar.zzb());
                    }
                    if (!z9) {
                        int i11 = size - 1;
                        while (true) {
                            if (i11 >= zzi.size() || i11 < 0) {
                                break;
                            }
                            zzab zzabVar2 = zzi.get(i11);
                            if (zzabVar2.getProviderId().equals(FirebaseAuthProvider.PROVIDER_ID)) {
                                jSONArray.put(zzabVar2.zzb());
                                z9 = true;
                                break;
                            }
                            if (i11 == zzi.size() - 1) {
                                jSONArray.put(zzabVar2.zzb());
                            }
                            i11++;
                        }
                        if (!z9) {
                            this.zzd.f("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(zzi.size()), Integer.valueOf(size));
                            if (zzi.size() < 5) {
                                StringBuilder sb = new StringBuilder("Provider user info list:\n");
                                Iterator<zzab> it = zzi.iterator();
                                while (it.hasNext()) {
                                    sb.append(String.format("Provider - %s\n", it.next().getProviderId()));
                                }
                                this.zzd.f(sb.toString(), new Object[0]);
                            }
                        }
                    }
                    jSONObject.put("userInfos", jSONArray);
                }
                jSONObject.put("anonymous", zzafVar.isAnonymous());
                jSONObject.put("version", "2");
                if (zzafVar.getMetadata() != null) {
                    jSONObject.put("userMetadata", ((zzah) zzafVar.getMetadata()).zza());
                }
                List<MultiFactorInfo> enrolledFactors = ((zzaj) zzafVar.getMultiFactor()).getEnrolledFactors();
                if (enrolledFactors != null && !enrolledFactors.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i12 = 0; i12 < enrolledFactors.size(); i12++) {
                        jSONArray2.put(enrolledFactors.get(i12).toJson());
                    }
                    jSONObject.put("userMultiFactorInfo", jSONArray2);
                }
                return jSONObject.toString();
            } catch (Exception e10) {
                a aVar = this.zzd;
                Log.wtf(aVar.f3538a, aVar.d("Failed to turn object into JSON", new Object[0]), e10);
                throw new zzxv(e10);
            }
        }
        return null;
    }

    public final FirebaseUser zza() {
        String string = this.zzc.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return zza(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void zzb(FirebaseUser firebaseUser) {
        b.s(firebaseUser);
        String zzc = zzc(firebaseUser);
        if (!TextUtils.isEmpty(zzc)) {
            this.zzc.edit().putString("com.google.firebase.auth.FIREBASE_USER", zzc).apply();
        }
    }

    public final zzafm zza(FirebaseUser firebaseUser) {
        b.s(firebaseUser);
        String string = this.zzc.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.getUid()), null);
        if (string != null) {
            return zzafm.zzb(string);
        }
        return null;
    }

    private final zzaf zza(JSONObject jSONObject) {
        JSONArray jSONArray;
        MultiFactorInfo zza;
        zzah zza2;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z9 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray2 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray2.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(zzab.zza(jSONArray2.getString(i10)));
            }
            zzaf zzafVar = new zzaf(FirebaseApp.getInstance(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzafVar.zza(zzafm.zzb(string));
            }
            if (!z9) {
                zzafVar.zzb();
            }
            zzafVar.zza(str);
            if (jSONObject.has("userMetadata") && (zza2 = zzah.zza(jSONObject.getJSONObject("userMetadata"))) != null) {
                zzafVar.zza(zza2);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i11));
                    String optString = jSONObject2.optString(MultiFactorInfo.FACTOR_ID_KEY);
                    if ("phone".equals(optString)) {
                        zza = PhoneMultiFactorInfo.zza(jSONObject2);
                    } else {
                        zza = Objects.equals(optString, TotpMultiFactorGenerator.FACTOR_ID) ? TotpMultiFactorInfo.zza(jSONObject2) : null;
                    }
                    arrayList2.add(zza);
                }
                zzafVar.zzb(arrayList2);
            }
            return zzafVar;
        } catch (zzxv | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException e10) {
            Log.wtf(this.zzd.f3538a, e10);
            return null;
        }
    }

    public final void zza(String str) {
        this.zzc.edit().remove(str).apply();
    }

    public final void zza(FirebaseUser firebaseUser, zzafm zzafmVar) {
        b.s(firebaseUser);
        b.s(zzafmVar);
        this.zzc.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.getUid()), zzafmVar.zzf()).apply();
    }
}
