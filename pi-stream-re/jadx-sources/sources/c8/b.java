package c8;

import a8.e;
import a8.f;
import a8.h;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import r6.h0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String[][] f2081b = {new String[]{"Trending Movies", "0", "9167640870324258216"}, new String[]{"Top Series", "5", "719331337777440448"}, new String[]{"New Release", "0", "1488104699998914056"}, new String[]{"In Cinema", "0", "5692654647815587592"}, new String[]{"Hollywood", "0", "8019599703232971616"}, new String[]{"Anime", "-1", "ch:1006"}, new String[]{"Bollywood", "0", "414907768299210008"}, new String[]{"South Indian", "0", "3859721901924910512"}, new String[]{"Asian Drama", "5", "1976033493293449744"}, new String[]{"Western TV", "5", "3910636007619709856"}, new String[]{"Reality TV", "5", "1255898847918934600"}};

    /* renamed from: a, reason: collision with root package name */
    public final d8.b f2082a;

    public b(d8.b bVar, Context context) {
        this.f2082a = bVar;
        context.getApplicationContext();
    }

    public static ArrayList a(ArrayList arrayList, List list) {
        String str;
        String str2;
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        arrayList2.addAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar != null && (str2 = hVar.f199b) != null) {
                hashSet.add(str2);
            }
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                h hVar2 = (h) it2.next();
                if (hVar2 != null && !hVar2.B && (str = hVar2.f199b) != null && hashSet.add(str)) {
                    arrayList2.add(hVar2);
                }
            }
        }
        return arrayList2;
    }

    public static boolean c(ArrayList arrayList) {
        String str;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar != null && !hVar.B && (str = hVar.f199b) != null && !str.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList i(ArrayList arrayList, List list) {
        String str;
        String str2;
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar != null && (str2 = hVar.f199b) != null) {
                hashSet.add(str2);
            }
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                h hVar2 = (h) it2.next();
                if (hVar2 != null && !hVar2.B && (str = hVar2.f199b) != null && hashSet.add(str)) {
                    arrayList2.add(hVar2);
                }
            }
        }
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public static d2.a l(e eVar, String str) {
        String str2;
        int[] D0 = h0.D0(eVar);
        String str3 = null;
        if (str != null && !str.isEmpty()) {
            str2 = h0.O0(str);
        } else {
            str2 = null;
        }
        if (str2 == null || str2.isEmpty()) {
            if (eVar != null) {
                str3 = h0.O0(eVar.f188f);
            }
            str2 = str3;
        }
        if ((str2 == null || str2.isEmpty()) && eVar != null) {
            str2 = eVar.f188f;
        }
        if (D0 != null && str2 != null && !str2.isEmpty()) {
            return new d2.a(str2, D0[0], D0[1]);
        }
        throw new IOException("Bad movie episode key");
    }

    public final List b(a8.b bVar) {
        String str;
        JSONObject jSONObject;
        int i10;
        int i11;
        StringBuilder sb;
        String str2;
        if (bVar == null) {
            return Collections.emptyList();
        }
        String N0 = h0.N0(bVar);
        if (N0 != null && !N0.isEmpty()) {
            String str3 = bVar.f168a;
            if (str3 == null) {
                str = "";
            } else {
                str = str3;
            }
            JSONArray jSONArray = null;
            try {
                d8.b bVar2 = this.f2082a;
                jSONObject = d8.b.m(bVar2.k("/wefeed-mobile-bff/subject-api/season-info?host=" + d8.b.f(bVar2.c()) + "&subjectId=" + d8.b.f(N0)));
            } catch (Exception e10) {
                Log.e("PrimaryClient", "moviebox seasons", e10);
                jSONObject = null;
            }
            String str4 = bVar.f170c;
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            if (jSONObject != null) {
                try {
                    jSONArray = jSONObject.optJSONArray("seasons");
                } catch (Exception e11) {
                    Log.e("MovieBoxBridge", "seasonsToEpisodes", e11);
                }
            }
            int i12 = 0;
            if (jSONArray != null && jSONArray.length() != 0) {
                int i13 = 0;
                loop0: while (i13 < jSONArray.length()) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i13);
                    if (optJSONObject != null) {
                        try {
                            String optString = optJSONObject.optString("se", "");
                            if (optString.isEmpty()) {
                                i10 = optJSONObject.optInt("se", i12);
                            } else {
                                i10 = Integer.parseInt(optString);
                            }
                        } catch (Exception unused) {
                            i10 = i12;
                        }
                        try {
                            String optString2 = optJSONObject.optString("maxEp", "");
                            if (optString2.isEmpty()) {
                                i11 = optJSONObject.optInt("maxEp", i12);
                            } else {
                                i11 = Integer.parseInt(optString2);
                            }
                        } catch (Exception unused2) {
                            i11 = i12;
                        }
                        int i14 = 1;
                        if (i11 >= 1 && i11 <= 500) {
                            int i15 = 1;
                            while (i15 <= i11) {
                                String N = h0.N(i10, i15, N0);
                                if (hashSet.add(N)) {
                                    if (jSONArray.length() > i14) {
                                        sb = new StringBuilder();
                                        sb.append("S");
                                        sb.append(i10);
                                        str2 = " E";
                                    } else {
                                        sb = new StringBuilder();
                                        str2 = "Episode ";
                                    }
                                    sb.append(str2);
                                    sb.append(i15);
                                    e eVar = new e(sb.toString(), N, str4, i15);
                                    eVar.f187e = str;
                                    eVar.f188f = N0;
                                    arrayList.add(eVar);
                                    if (arrayList.size() >= 400) {
                                        break loop0;
                                    }
                                }
                                i15++;
                                i14 = 1;
                            }
                        } else {
                            String N2 = h0.N(i10, i12, N0);
                            if (hashSet.add(N2)) {
                                e eVar2 = new e(str, N2, str4, 0.0f);
                                eVar2.f187e = str;
                                eVar2.f188f = N0;
                                arrayList.add(eVar2);
                                if (arrayList.size() >= 400) {
                                    break;
                                }
                            }
                        }
                    }
                    i13++;
                    i12 = 0;
                }
                return arrayList;
            }
            e eVar3 = new e(str, h0.N(0, 0, N0), str4, 0.0f);
            eVar3.f187e = str;
            eVar3.f188f = N0;
            arrayList.add(eVar3);
            return arrayList;
        }
        return Collections.emptyList();
    }

    public final LinkedHashMap d() {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (a8.b bVar : k(0, 1, "9167640870324258216")) {
            String str = bVar.D;
            if (str != null && hashSet.add(str)) {
                arrayList.add(bVar);
            }
        }
        for (a8.b bVar2 : k(0, 2, "9167640870324258216")) {
            String str2 = bVar2.D;
            if (str2 != null && hashSet.add(str2)) {
                arrayList.add(bVar2);
            }
        }
        for (a8.b bVar3 : k(0, 1, "3343007159239034280")) {
            String str3 = bVar3.D;
            if (str3 != null && hashSet.add(str3)) {
                arrayList.add(bVar3);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] strArr = {"trending", "popular", "season", "upcoming", "fanFavorites", "movies", "topTv", "ona", "ova", "special", "music", "latest"};
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 12; i10++) {
                linkedHashMap.put(strArr[i10], Collections.emptyList());
            }
            return linkedHashMap;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 12; i12++) {
            String str4 = strArr[i12];
            ArrayList arrayList2 = new ArrayList();
            for (int i13 = 0; i13 < 16; i13++) {
                arrayList2.add((a8.b) arrayList.get((i11 + i13) % arrayList.size()));
            }
            i11 = (i11 + 7) % arrayList.size();
            linkedHashMap.put(str4, arrayList2);
        }
        return linkedHashMap;
    }

    public final ArrayList e(e eVar, String str) {
        d2.a l10 = l(eVar, str);
        d8.b bVar = this.f2082a;
        int i10 = l10.f3089b;
        int i11 = l10.f3090c;
        String str2 = l10.f3088a;
        JSONObject n9 = bVar.n(i10, i11, str2);
        if (n9 != null) {
            ArrayList t02 = h0.t0(bVar, str2, n9, bVar.c() + "/");
            if (!t02.isEmpty()) {
                if (!c(t02)) {
                    try {
                        ArrayList i12 = i(t02, g(i10, i11, str2));
                        if (!i12.isEmpty()) {
                            return i12;
                        }
                        return t02;
                    } catch (Exception e10) {
                        Log.e("PrimaryClient", "moviebox web merge", e10);
                        return t02;
                    }
                }
                return t02;
            }
            throw new IOException("No sources found");
        }
        throw new IOException("No play info");
    }

    public final ArrayList f(e eVar, String str) {
        d2.a l10 = l(eVar, str);
        d8.b bVar = this.f2082a;
        int i10 = l10.f3089b;
        int i11 = l10.f3090c;
        String str2 = l10.f3088a;
        JSONObject n9 = bVar.n(i10, i11, str2);
        if (n9 != null) {
            ArrayList t02 = h0.t0(bVar, str2, n9, bVar.c() + "/");
            if (!t02.isEmpty()) {
                return t02;
            }
            throw new IOException("No sources found");
        }
        throw new IOException("No play info");
    }

    public final List g(int i10, int i11, String str) {
        JSONObject jSONObject;
        String str2;
        String str3;
        int i12;
        d8.b bVar = this.f2082a;
        String str4 = null;
        try {
            jSONObject = bVar.d(str);
        } catch (Exception e10) {
            Log.e("PrimaryClient", "moviebox web detail", e10);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return Collections.emptyList();
        }
        String optString = jSONObject.optString("detailPath", "");
        if (optString.isEmpty()) {
            String optString2 = jSONObject.optString("detailUrl", "");
            if (!optString2.isEmpty()) {
                try {
                    String str5 = optString2.split("\\?")[0];
                    while (str5.endsWith("/")) {
                        str5 = str5.substring(0, str5.length() - 1);
                    }
                    int lastIndexOf = str5.lastIndexOf(47);
                    if (lastIndexOf >= 0 && (i12 = lastIndexOf + 1) < str5.length()) {
                        optString = str5.substring(i12);
                    }
                } catch (Exception unused) {
                }
            }
            str2 = null;
            if (str2 == null && !str2.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                try {
                    String optString3 = jSONObject.optString("detailUrl", "");
                    if (!optString3.isEmpty()) {
                        URI uri = new URI(optString3);
                        if (uri.getHost() != null) {
                            if (uri.getScheme() != null) {
                                str3 = uri.getScheme();
                            } else {
                                str3 = "https";
                            }
                            str4 = str3 + "://" + uri.getHost();
                        }
                    }
                } catch (Exception unused2) {
                }
                if (str4 != null && !str4.isEmpty()) {
                    arrayList.add(str4);
                }
                String[] strArr = d8.b.f3244g;
                for (int i13 = 0; i13 < 7; i13++) {
                    String str6 = strArr[i13];
                    if (!arrayList.contains(str6)) {
                        arrayList.add(str6);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str7 = (String) it.next();
                    try {
                        JSONObject s9 = this.f2082a.s(str7, str, i10, i11, str2);
                        if (s9 != null) {
                            ArrayList e12 = h0.e1(bVar, str, s9, str7, str7 + "/movies/" + str2 + "?id=" + str + "&type=/movie/detail&detailSe=&detailEp=&lang=en");
                            if (c(e12)) {
                                return e12;
                            }
                        }
                    } catch (Exception e11) {
                        Log.e("PrimaryClient", "moviebox web play " + str7, e11);
                    }
                }
                return Collections.emptyList();
            }
            return Collections.emptyList();
        }
        str2 = optString;
        if (str2 == null) {
        }
        return Collections.emptyList();
    }

    public final ArrayList h() {
        List emptyList;
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
        try {
            ArrayList arrayList = new ArrayList();
            String[][] strArr = f2081b;
            for (int i10 = 0; i10 < 11; i10++) {
                String[] strArr2 = strArr[i10];
                arrayList.add(newFixedThreadPool.submit(new a(this, Integer.parseInt(strArr2[1]), strArr2[2])));
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < 11; i11++) {
                try {
                    emptyList = (List) ((Future) arrayList.get(i11)).get(30L, TimeUnit.SECONDS);
                } catch (Exception unused) {
                    emptyList = Collections.emptyList();
                }
                if (emptyList != null && !emptyList.isEmpty()) {
                    String[] strArr3 = strArr[i11];
                    arrayList2.add(new f(strArr3[0], Integer.parseInt(strArr3[1]), strArr[i11][2], emptyList));
                }
            }
            return arrayList2;
        } finally {
            newFixedThreadPool.shutdownNow();
        }
    }

    public final List j(int i10, int i11, String str) {
        if (str != null) {
            try {
                if (str.startsWith("ch:")) {
                    JSONObject b10 = this.f2082a.b(str.substring(3), Math.max(1, i11), null, null, null, null, null);
                    if (b10 == null) {
                        return Collections.emptyList();
                    }
                    return h0.Q0(b10);
                }
            } catch (Exception e10) {
                Log.e("PrimaryClient", "rail failed " + str, e10);
                return Collections.emptyList();
            }
        }
        return k(i10, i11, str);
    }

    public final List k(int i10, int i11, String str) {
        try {
            JSONObject p3 = this.f2082a.p(String.valueOf(i10), Math.max(1, i11), str);
            if (p3 == null) {
                return Collections.emptyList();
            }
            return h0.Q0(p3);
        } catch (Exception e10) {
            Log.e("PrimaryClient", "ranking failed", e10);
            return Collections.emptyList();
        }
    }

    public final List m(String str, int i10) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str.trim();
        }
        if (str2.startsWith("mb:")) {
            str2 = str2.substring(3).trim();
        }
        if (str2.isEmpty()) {
            return Collections.emptyList();
        }
        h0.f9469a = "";
        d8.b bVar = this.f2082a;
        int max = Math.max(1, i10);
        bVar.getClass();
        String replace = str2.replace("\\", "").replace("\"", "");
        if (replace.length() > 60) {
            replace = replace.substring(0, 60);
        }
        JSONObject m5 = d8.b.m(bVar.o("/wefeed-mobile-bff/subject-api/search/v2", "{\"page\": " + max + ", \"perPage\": 20, \"keyword\": \"" + replace + "\", \"restrictKid\": 0}"));
        if (m5 == null) {
            if (this.f2082a.f3250e.isEmpty()) {
                this.f2082a.f3250e = "no response";
            }
            h0.f9469a = this.f2082a.f3250e;
            Log.d("MovieBox", "search empty: " + h0.f9469a);
            return Collections.emptyList();
        }
        ArrayList Q0 = h0.Q0(m5);
        if (Q0.isEmpty()) {
            h0.f9469a = "200 OK but 0 subjects parsed";
            Log.d("MovieBox", "search empty: 0 subjects parsed");
        }
        return Q0;
    }
}
