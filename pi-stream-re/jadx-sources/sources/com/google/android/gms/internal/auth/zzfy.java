package com.google.android.gms.internal.auth;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfy {
    public static String zza(zzfw zzfwVar, String str) {
        StringBuilder a10 = j.a("# ", str);
        zzd(zzfwVar, a10, 0);
        return a10.toString();
    }

    public static final void zzb(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzgw.zza(zzee.zzl((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzee) {
            sb.append(": \"");
            sb.append(zzgw.zza((zzee) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzeu) {
            sb.append(" {");
            zzd((zzeu) obj, sb, i10 + 2);
            sb.append("\n");
            while (i11 < i10) {
                sb.append(' ');
                i11++;
            }
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i13 = i10 + 2;
            zzb(sb, i13, "key", entry.getKey());
            zzb(sb, i13, "value", entry.getValue());
            sb.append("\n");
            while (i11 < i10) {
                sb.append(' ');
                i11++;
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    private static final String zzc(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void zzd(zzfw zzfwVar, StringBuilder sb, int i10) {
        String str;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzfwVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String concat = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 4)));
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i10, zzc(concat), zzeu.zze(method2, zzfwVar, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String concat2 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 3)));
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i10, zzc(concat2), zzeu.zze(method3, zzfwVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(str))) != null && (!str.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(str.substring(0, str.length() - 5)))))) {
                String concat3 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(str));
                Method method5 = (Method) hashMap.get("has".concat(str));
                if (method4 != null) {
                    Object zze = zzeu.zze(method4, zzfwVar, new Object[0]);
                    if (method5 == null) {
                        if (zze instanceof Boolean) {
                            if (((Boolean) zze).booleanValue()) {
                                zzb(sb, i10, zzc(concat3), zze);
                            }
                        } else if (zze instanceof Integer) {
                            if (((Integer) zze).intValue() != 0) {
                                zzb(sb, i10, zzc(concat3), zze);
                            }
                        } else if (zze instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zze).floatValue()) != 0) {
                                zzb(sb, i10, zzc(concat3), zze);
                            }
                        } else if (zze instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zze).doubleValue()) != 0) {
                                zzb(sb, i10, zzc(concat3), zze);
                            }
                        } else {
                            if (zze instanceof String) {
                                equals = zze.equals("");
                            } else if (zze instanceof zzee) {
                                equals = zze.equals(zzee.zzb);
                            } else if (zze instanceof zzfw) {
                                if (zze != ((zzfw) zze).zzh()) {
                                    zzb(sb, i10, zzc(concat3), zze);
                                }
                            } else {
                                if ((zze instanceof Enum) && ((Enum) zze).ordinal() == 0) {
                                }
                                zzb(sb, i10, zzc(concat3), zze);
                            }
                            if (!equals) {
                                zzb(sb, i10, zzc(concat3), zze);
                            }
                        }
                    } else if (((Boolean) zzeu.zze(method5, zzfwVar, new Object[0])).booleanValue()) {
                        zzb(sb, i10, zzc(concat3), zze);
                    }
                }
            }
        }
        if (!(zzfwVar instanceof zzet)) {
            zzgz zzgzVar = ((zzeu) zzfwVar).zzc;
            if (zzgzVar != null) {
                zzgzVar.zze(sb, i10);
                return;
            }
            return;
        }
        throw null;
    }
}
