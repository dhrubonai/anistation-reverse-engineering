package com.google.android.recaptcha.internal;

import a3.g;
import com.google.android.recaptcha.internal.zzge;
import com.google.android.recaptcha.internal.zzgf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import r.f;

/* loaded from: classes.dex */
public abstract class zzgf<MessageType extends zzgf<MessageType, BuilderType>, BuilderType extends zzge<MessageType, BuilderType>> implements zzke {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzc(Iterable iterable, List list) {
        byte[] bArr = zzjc.zzd;
        iterable.getClass();
        if (iterable instanceof zzjm) {
            List zzh = ((zzjm) iterable).zzh();
            zzjm zzjmVar = (zzjm) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String o = g.o("Element at index ", zzjmVar.size() - size, " is null.");
                    int size2 = zzjmVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            zzjmVar.remove(size2);
                        }
                    }
                    throw new NullPointerException(o);
                }
                if (obj instanceof zzgw) {
                    zzjmVar.zzi((zzgw) obj);
                } else {
                    zzjmVar.add((String) obj);
                }
            }
            return;
        }
        if (!(iterable instanceof zzkm)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String o6 = g.o("Element at index ", list.size() - size3, " is null.");
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        } else {
                            list.remove(size4);
                        }
                    }
                    throw new NullPointerException(o6);
                }
                list.add(obj2);
            }
            return;
        }
        list.addAll(iterable);
    }

    public int zza(zzkr zzkrVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final zzgw zzb() {
        try {
            int zzn = zzn();
            zzgw zzgwVar = zzgw.zzb;
            byte[] bArr = new byte[zzn];
            zzhh zzA = zzhh.zzA(bArr, 0, zzn);
            zze(zzA);
            zzA.zzB();
            return new zzgt(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(f.e("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public final byte[] zzd() {
        try {
            int zzn = zzn();
            byte[] bArr = new byte[zzn];
            zzhh zzA = zzhh.zzA(bArr, 0, zzn);
            zze(zzA);
            zzA.zzB();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(f.e("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
