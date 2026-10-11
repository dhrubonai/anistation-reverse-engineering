package b1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.appcompat.widget.a0;
import f.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f1281f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static b f1282g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1283a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1284b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1285c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1286d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final f f1287e;

    public b(Context context) {
        this.f1283a = context;
        this.f1287e = new f(this, context.getMainLooper(), 1);
    }

    public static b a(Context context) {
        b bVar;
        synchronized (f1281f) {
            if (f1282g == null) {
                f1282g = new b(context.getApplicationContext());
            }
            bVar = f1282g;
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(Intent intent) {
        Object[] objArr;
        ArrayList arrayList;
        int i10;
        String str;
        boolean z9;
        String str2;
        synchronized (this.f1284b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f1283a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z10 = true;
            boolean z11 = false;
            if ((intent.getFlags() & 8) != 0) {
                objArr = true;
            } else {
                objArr = false;
            }
            if (objArr != false) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList arrayList2 = (ArrayList) this.f1285c.get(intent.getAction());
            if (arrayList2 != null) {
                if (objArr != false) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                }
                ArrayList arrayList3 = null;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    a aVar = (a) arrayList2.get(i11);
                    if (objArr != false) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + aVar.f1277a);
                    }
                    if (aVar.f1279c) {
                        if (objArr != false) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        arrayList = arrayList2;
                        i10 = i11;
                        str = action;
                        z9 = z10;
                    } else {
                        String str3 = action;
                        arrayList = arrayList2;
                        i10 = i11;
                        str = action;
                        z9 = z10;
                        int match = aVar.f1277a.match(str3, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (objArr != false) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(aVar);
                            aVar.f1279c = z9;
                        } else if (objArr != false) {
                            if (match != -4) {
                                if (match != -3) {
                                    if (match != -2) {
                                        if (match != -1) {
                                            str2 = "unknown reason";
                                        } else {
                                            str2 = "type";
                                        }
                                    } else {
                                        str2 = "data";
                                    }
                                } else {
                                    str2 = "action";
                                }
                            } else {
                                str2 = "category";
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str2);
                        }
                    }
                    i11 = i10 + 1;
                    z10 = z9;
                    arrayList2 = arrayList;
                    action = str;
                    z11 = false;
                }
                boolean z12 = z10;
                if (arrayList3 != null) {
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        ((a) arrayList3.get(i12)).f1279c = false;
                    }
                    this.f1286d.add(new a0(6, intent, arrayList3));
                    if (!this.f1287e.hasMessages(z12 ? 1 : 0)) {
                        this.f1287e.sendEmptyMessage(z12 ? 1 : 0);
                    }
                    return z12;
                }
            }
            return false;
        }
    }
}
