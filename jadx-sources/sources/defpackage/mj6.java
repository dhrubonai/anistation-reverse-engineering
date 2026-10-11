package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mj6 {
    public static final mj6 f = new mj6();
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static Handler h = null;
    public static final ns1 i = new ns1((byte) 2);
    public static final ns1 j = new ns1((byte) 3);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final mm2 d = new mm2();
    public final y23 c = new y23((byte) 25);
    public final l33 e = new l33((Object) new xf6((byte) 4), (byte) 27);

    public static void b() {
        if (h == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            h = handler;
            handler.post(i);
            h.postDelayed(j, 200L);
        }
    }

    public final void a(View view, fq3 fq3Var, JSONObject jSONObject, boolean z) {
        char c;
        String str;
        if (ss5.b(view) == null) {
            mm2 mm2Var = this.d;
            boolean z2 = true;
            if (((HashSet) mm2Var.e).contains(view)) {
                c = 1;
            } else if (mm2Var.d) {
                c = 2;
            } else {
                c = 3;
            }
            if (c != 3) {
                JSONObject h2 = fq3Var.h(view);
                ha7.c(jSONObject, h2);
                HashMap hashMap = mm2Var.a;
                if (hashMap.size() == 0) {
                    str = null;
                } else {
                    String str2 = (String) hashMap.get(view);
                    if (str2 != null) {
                        hashMap.remove(view);
                    }
                    str = str2;
                }
                boolean z3 = false;
                if (str != null) {
                    try {
                        h2.put("adSessionId", str);
                    } catch (JSONException e) {
                        Log.e("OMIDLIB", "Error with setting ad session id", e);
                    }
                    WeakHashMap weakHashMap = (WeakHashMap) mm2Var.i;
                    if (weakHashMap.containsKey(view)) {
                        weakHashMap.put(view, Boolean.TRUE);
                    } else {
                        z3 = true;
                    }
                    try {
                        h2.put("hasWindowFocus", Boolean.valueOf(z3));
                    } catch (JSONException e2) {
                        Log.e("OMIDLIB", "Error with setting has window focus", e2);
                    }
                    mm2Var.d = true;
                    return;
                }
                h11.v(mm2Var.b.get(view));
                if (c != 1) {
                    z2 = false;
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (z2) {
                        HashMap hashMap2 = new HashMap();
                        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                            View childAt = viewGroup.getChildAt(i2);
                            ArrayList arrayList = (ArrayList) hashMap2.get(Float.valueOf(childAt.getZ()));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                hashMap2.put(Float.valueOf(childAt.getZ()), arrayList);
                            }
                            arrayList.add(childAt);
                        }
                        ArrayList arrayList2 = new ArrayList(hashMap2.keySet());
                        Collections.sort(arrayList2);
                        int size = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList2.get(i3);
                            i3++;
                            ArrayList arrayList3 = (ArrayList) hashMap2.get((Float) obj);
                            int size2 = arrayList3.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                Object obj2 = arrayList3.get(i4);
                                i4++;
                                a((View) obj2, fq3Var, h2, z);
                            }
                        }
                        return;
                    }
                    for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                        a(viewGroup.getChildAt(i5), fq3Var, h2, z);
                    }
                }
            }
        }
    }
}
