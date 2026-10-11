package g5;

import android.util.Base64;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p7.a0;

/* loaded from: classes.dex */
public abstract class c {
    public static final void e(StringBuilder sb, a aVar, Object obj) {
        int i10 = aVar.f4437b;
        if (i10 != 11) {
            if (i10 == 7) {
                sb.append("\"");
                sb.append(i5.a.a((String) obj));
                sb.append("\"");
                return;
            }
            sb.append(obj);
            return;
        }
        Class cls = aVar.f4443y;
        w7.b.s(cls);
        sb.append(((c) cls.cast(obj)).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <O, I> I zaD(a aVar, Object obj) {
        b bVar = aVar.B;
        if (bVar != null) {
            f5.a aVar2 = (f5.a) bVar;
            I i10 = (I) ((String) aVar2.f3925c.get(((Integer) obj).intValue()));
            if (i10 == null && aVar2.f3924b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
            return i10;
        }
        return obj;
    }

    public <T extends c> void addConcreteTypeArrayInternal(a aVar, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends c> void addConcreteTypeInternal(a aVar, String str, T t9) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(a aVar, Object obj) {
        String str = aVar.f4441f;
        b bVar = aVar.B;
        w7.b.s(bVar);
        HashMap hashMap = ((f5.a) bVar).f3924b;
        Integer num = (Integer) hashMap.get((String) obj);
        Integer num2 = num;
        if (num == null) {
            num2 = (Integer) hashMap.get("gms_unknown");
        }
        w7.b.s(num2);
        int i10 = aVar.f4439d;
        switch (i10) {
            case 0:
                setIntegerInternal(aVar, str, num2.intValue());
                return;
            case 1:
                zaf(aVar, str, (BigInteger) num2);
                return;
            case 2:
                setLongInternal(aVar, str, ((Long) num2).longValue());
                return;
            case 3:
            default:
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unsupported type for conversion: ");
                sb.append(i10);
                throw new IllegalStateException(sb.toString());
            case 4:
                zan(aVar, str, ((Double) num2).doubleValue());
                return;
            case 5:
                zab(aVar, str, (BigDecimal) num2);
                return;
            case 6:
                setBooleanInternal(aVar, str, ((Boolean) num2).booleanValue());
                return;
            case zzaja.zze.zzg /* 7 */:
                setStringInternal(aVar, str, (String) num2);
                return;
            case 8:
            case 9:
                setDecodedBytesInternal(aVar, str, (byte[]) num2);
                return;
        }
    }

    public abstract Map<String, a> getFieldMappings();

    public Object getFieldValue(a aVar) {
        boolean z9;
        String str = aVar.f4441f;
        if (aVar.f4443y != null) {
            if (getValueObject(str) == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object[] objArr = {aVar.f4441f};
            if (z9) {
                try {
                    char upperCase = Character.toUpperCase(str.charAt(0));
                    String substring = str.substring(1);
                    StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
                    sb.append("get");
                    sb.append(upperCase);
                    sb.append(substring);
                    return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
            throw new IllegalStateException(String.format("Concrete field shouldn't be value object: %s", objArr));
        }
        return getValueObject(str);
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(a aVar) {
        if (aVar.f4439d == 11) {
            if (aVar.f4440e) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        return isPrimitiveFieldSet(aVar.f4441f);
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(a aVar, String str, boolean z9) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(a aVar, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(a aVar, String str, int i10) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(a aVar, String str, long j4) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(a aVar, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(a aVar, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(a aVar, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, a> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            a aVar = fieldMappings.get(str);
            if (isFieldSet(aVar)) {
                Object zaD = zaD(aVar, getFieldValue(aVar));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (zaD == null) {
                    sb.append("null");
                } else {
                    switch (aVar.f4439d) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) zaD, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) zaD, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            a0.q0(sb, (HashMap) zaD);
                            break;
                        default:
                            if (aVar.f4438c) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        e(sb, aVar, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                e(sb, aVar, zaD);
                                break;
                            }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final <O> void zaA(a aVar, String str) {
        if (aVar.B != null) {
            d(aVar, str);
        } else {
            setStringInternal(aVar, aVar.f4441f, str);
        }
    }

    public final <O> void zaB(a aVar, Map<String, String> map) {
        if (aVar.B != null) {
            d(aVar, map);
        } else {
            setStringMapInternal(aVar, aVar.f4441f, map);
        }
    }

    public final <O> void zaC(a aVar, ArrayList<String> arrayList) {
        if (aVar.B != null) {
            d(aVar, arrayList);
        } else {
            setStringsInternal(aVar, aVar.f4441f, arrayList);
        }
    }

    public final <O> void zaa(a aVar, BigDecimal bigDecimal) {
        if (aVar.B != null) {
            d(aVar, bigDecimal);
        } else {
            zab(aVar, aVar.f4441f, bigDecimal);
        }
    }

    public void zab(a aVar, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final <O> void zac(a aVar, ArrayList<BigDecimal> arrayList) {
        if (aVar.B != null) {
            d(aVar, arrayList);
        } else {
            zad(aVar, aVar.f4441f, arrayList);
        }
    }

    public void zad(a aVar, String str, ArrayList<BigDecimal> arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final <O> void zae(a aVar, BigInteger bigInteger) {
        if (aVar.B != null) {
            d(aVar, bigInteger);
        } else {
            zaf(aVar, aVar.f4441f, bigInteger);
        }
    }

    public void zaf(a aVar, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final <O> void zag(a aVar, ArrayList<BigInteger> arrayList) {
        if (aVar.B != null) {
            d(aVar, arrayList);
        } else {
            zah(aVar, aVar.f4441f, arrayList);
        }
    }

    public void zah(a aVar, String str, ArrayList<BigInteger> arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final <O> void zai(a aVar, boolean z9) {
        if (aVar.B != null) {
            d(aVar, Boolean.valueOf(z9));
        } else {
            setBooleanInternal(aVar, aVar.f4441f, z9);
        }
    }

    public final <O> void zaj(a aVar, ArrayList<Boolean> arrayList) {
        if (aVar.B != null) {
            d(aVar, arrayList);
        } else {
            zak(aVar, aVar.f4441f, arrayList);
        }
    }

    public void zak(a aVar, String str, ArrayList<Boolean> arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final <O> void zal(a aVar, byte[] bArr) {
        if (aVar.B != null) {
            d(aVar, bArr);
        } else {
            setDecodedBytesInternal(aVar, aVar.f4441f, bArr);
        }
    }

    public final <O> void zam(a aVar, double d10) {
        if (aVar.B != null) {
            d(aVar, Double.valueOf(d10));
        } else {
            zan(aVar, aVar.f4441f, d10);
        }
    }

    public void zan(a aVar, String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final <O> void zao(a aVar, ArrayList<Double> arrayList) {
        if (aVar.B != null) {
            d(aVar, arrayList);
        } else {
            zap(aVar, aVar.f4441f, arrayList);
        }
    }

    public void zap(a aVar, String str, ArrayList<Double> arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final <O> void zaq(a aVar, float f10) {
        if (aVar.B != null) {
            d(aVar, Float.valueOf(f10));
        } else {
            zar(aVar, aVar.f4441f, f10);
        }
    }

    public void zar(a aVar, String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final <O> void zas(a aVar, ArrayList<Float> arrayList) {
        if (aVar.B != null) {
            d(aVar, arrayList);
        } else {
            zat(aVar, aVar.f4441f, arrayList);
        }
    }

    public void zat(a aVar, String str, ArrayList<Float> arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final <O> void zau(a aVar, int i10) {
        if (aVar.B != null) {
            d(aVar, Integer.valueOf(i10));
        } else {
            setIntegerInternal(aVar, aVar.f4441f, i10);
        }
    }

    public final <O> void zav(a aVar, ArrayList<Integer> arrayList) {
        if (aVar.B != null) {
            d(aVar, arrayList);
        } else {
            zaw(aVar, aVar.f4441f, arrayList);
        }
    }

    public void zaw(a aVar, String str, ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final <O> void zax(a aVar, long j4) {
        if (aVar.B != null) {
            d(aVar, Long.valueOf(j4));
        } else {
            setLongInternal(aVar, aVar.f4441f, j4);
        }
    }

    public final <O> void zay(a aVar, ArrayList<Long> arrayList) {
        if (aVar.B != null) {
            d(aVar, arrayList);
        } else {
            zaz(aVar, aVar.f4441f, arrayList);
        }
    }

    public void zaz(a aVar, String str, ArrayList<Long> arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
