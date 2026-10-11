package l1;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class c {
    public static e a(AudioManager audioManager, c1.g gVar) {
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) gVar.a().f3762b);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(com.bumptech.glide.d.b(12)));
        int i10 = 0;
        for (int i11 = 0; i11 < directProfilesForAttributes.size(); i11++) {
            AudioProfile c6 = k1.e0.c(directProfilesForAttributes.get(i11));
            encapsulationType = c6.getEncapsulationType();
            if (encapsulationType != 1) {
                format = c6.getFormat();
                if (f1.b0.K(format) || e.f6646e.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        channelMasks2 = c6.getChannelMasks();
                        set.addAll(com.bumptech.glide.d.b(channelMasks2));
                    } else {
                        Integer valueOf = Integer.valueOf(format);
                        channelMasks = c6.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(com.bumptech.glide.d.b(channelMasks)));
                    }
                }
            }
        }
        r6.m0 m0Var = r6.o0.f9505b;
        r6.h0.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        for (Map.Entry entry : hashMap.entrySet()) {
            d dVar = new d(((Integer) entry.getKey()).intValue(), (Set) entry.getValue());
            int i12 = i10 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, q6.g.y(objArr.length, i12));
            }
            objArr[i10] = dVar;
            i10 = i12;
        }
        return new e(r6.o0.h(i10, objArr));
    }

    public static i b(AudioManager audioManager, c1.g gVar) {
        List audioDevicesForAttributes;
        try {
            audioManager.getClass();
            audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) gVar.a().f3762b);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new i((AudioDeviceInfo) audioDevicesForAttributes.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
