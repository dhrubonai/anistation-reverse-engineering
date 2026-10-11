package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vs7 {
    public final Object a;
    public final Object b;
    public Cloneable c;
    public final Object d;

    public vs7(vs7 vs7Var, y23 y23Var) {
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = vs7Var;
        this.b = y23Var;
    }

    public Bundle a() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        bt7 bt7Var = (bt7) this.d;
        gu7 gu7Var = (gu7) bt7Var.x;
        if (((Bundle) this.c) == null) {
            String string3 = bt7Var.P().getString((String) this.a, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i);
                            string = jSONObject.getString("n");
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            es7 es7Var = gu7Var.C;
                            gu7.l(es7Var);
                            es7Var.C.a("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            yi7.a();
                                            if (gu7Var.A.W(null, tq7.P0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i2 = 0; i2 < length; i2++) {
                                                    jArr[i2] = jSONArray2.optLong(i2);
                                                }
                                                bundle.putLongArray(string, jArr);
                                            }
                                        }
                                    } else if (string2.equals("ia")) {
                                        yi7.a();
                                        if (gu7Var.A.W(null, tq7.P0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i3 = 0; i3 < length2; i3++) {
                                                iArr[i3] = jSONArray3.optInt(i3);
                                            }
                                            bundle.putIntArray(string, iArr);
                                        }
                                    }
                                } else if (string2.equals("s")) {
                                    bundle.putString(string, jSONObject.getString("v"));
                                }
                            } else if (string2.equals("l")) {
                                bundle.putLong(string, Long.parseLong(jSONObject.getString("v")));
                            }
                        } else if (string2.equals("d")) {
                            bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                        }
                        es7 es7Var2 = gu7Var.C;
                        gu7.l(es7Var2);
                        es7Var2.C.b(string2, "Unrecognized persisted bundle type. Type");
                    }
                    this.c = bundle;
                } catch (JSONException unused2) {
                    es7 es7Var3 = gu7Var.C;
                    gu7.l(es7Var3);
                    es7Var3.C.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.c) == null) {
                this.c = (Bundle) this.b;
            }
        }
        Bundle bundle2 = (Bundle) this.c;
        a34.x(bundle2);
        return new Bundle(bundle2);
    }

    public ik7 b(ik7 ik7Var) {
        return ((y23) this.b).f0(this, ik7Var);
    }

    public ik7 c(rf7 rf7Var) {
        ik7 ik7Var = ik7.p;
        Iterator o = rf7Var.o();
        while (o.hasNext()) {
            ik7Var = ((y23) this.b).f0(this, rf7Var.q(((Integer) o.next()).intValue()));
            if (ik7Var instanceof eh7) {
                break;
            }
        }
        return ik7Var;
    }

    public void d(Bundle bundle) {
        Bundle bundle2;
        bt7 bt7Var = (bt7) this.d;
        gu7 gu7Var = (gu7) bt7Var.x;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        SharedPreferences.Editor edit = bt7Var.P().edit();
        int size = bundle2.size();
        String str = (String) this.a;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        yi7.a();
                        if (gu7Var.A.W(null, tq7.P0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                es7 es7Var = gu7Var.C;
                                gu7.l(es7Var);
                                es7Var.C.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                es7 es7Var2 = gu7Var.C;
                                gu7.l(es7Var2);
                                es7Var2.C.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        es7 es7Var3 = gu7Var.C;
                        gu7.l(es7Var3);
                        es7Var3.C.b(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.c = bundle2;
    }

    public vs7 e() {
        return new vs7(this, (y23) this.b);
    }

    public boolean f(String str) {
        if (((HashMap) this.c).containsKey(str)) {
            return true;
        }
        vs7 vs7Var = (vs7) this.a;
        if (vs7Var != null) {
            return vs7Var.f(str);
        }
        return false;
    }

    public void g(String str, ik7 ik7Var) {
        vs7 vs7Var;
        HashMap hashMap = (HashMap) this.c;
        if (!hashMap.containsKey(str) && (vs7Var = (vs7) this.a) != null && vs7Var.f(str)) {
            vs7Var.g(str, ik7Var);
        } else {
            if (((HashMap) this.d).containsKey(str)) {
                return;
            }
            if (ik7Var == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, ik7Var);
            }
        }
    }

    public void h(String str, ik7 ik7Var) {
        if (((HashMap) this.d).containsKey(str)) {
            return;
        }
        HashMap hashMap = (HashMap) this.c;
        if (ik7Var == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, ik7Var);
        }
    }

    public ik7 i(String str) {
        HashMap hashMap = (HashMap) this.c;
        if (hashMap.containsKey(str)) {
            return (ik7) hashMap.get(str);
        }
        vs7 vs7Var = (vs7) this.a;
        if (vs7Var != null) {
            return vs7Var.i(str);
        }
        ze0.k(h11.j(str, " is not defined"));
        return null;
    }

    public vs7(bt7 bt7Var, String str) {
        this.d = bt7Var;
        a34.u(str);
        this.a = str;
        this.b = new Bundle();
    }
}
