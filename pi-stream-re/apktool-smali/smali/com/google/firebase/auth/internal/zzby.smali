.class public final Lcom/google/firebase/auth/internal/zzby;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:Landroid/content/Context;

.field private zzb:Ljava/lang/String;

.field private zzc:Landroid/content/SharedPreferences;

.field private zzd:Le5/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lw7/b;->o(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lcom/google/firebase/auth/internal/zzby;->zzb:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzby;->zza:Landroid/content/Context;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    new-array p1, p1, [Ljava/lang/Object;

    .line 20
    .line 21
    iget-object p2, p0, Lcom/google/firebase/auth/internal/zzby;->zzb:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    aput-object p2, p1, v0

    .line 25
    .line 26
    const-string p2, "com.google.firebase.auth.api.Store.%s"

    .line 27
    .line 28
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p2, p0, Lcom/google/firebase/auth/internal/zzby;->zza:Landroid/content/Context;

    .line 33
    .line 34
    invoke-virtual {p2, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzby;->zzc:Landroid/content/SharedPreferences;

    .line 39
    .line 40
    new-instance p1, Le5/a;

    .line 41
    .line 42
    const-string p2, "StorageHelpers"

    .line 43
    .line 44
    new-array v0, v0, [Ljava/lang/String;

    .line 45
    .line 46
    invoke-direct {p1, p2, v0}, Le5/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzby;->zzd:Le5/a;

    .line 50
    .line 51
    return-void
.end method

.method private final zza(Lorg/json/JSONObject;)Lcom/google/firebase/auth/internal/zzaf;
    .locals 13

    const-string v0, "userMultiFactorInfo"

    const-string v1, "userMetadata"

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "cachedTokenState"

    .line 12
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "applicationName"

    .line 13
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "anonymous"

    .line 14
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v5

    const-string v6, "2"

    const-string v7, "version"

    .line 15
    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_0

    move-object v6, v7

    :cond_0
    const-string v7, "userInfos"

    .line 16
    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 17
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-nez v8, :cond_1

    return-object v2

    .line 18
    :cond_1
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v8}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v10, 0x0

    move v11, v10

    :goto_0
    if-ge v11, v8, :cond_2

    .line 19
    invoke-virtual {v7, v11}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/google/firebase/auth/internal/zzab;->zza(Ljava/lang/String;)Lcom/google/firebase/auth/internal/zzab;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 20
    :cond_2
    invoke-static {v4}, Lcom/google/firebase/FirebaseApp;->getInstance(Ljava/lang/String;)Lcom/google/firebase/FirebaseApp;

    move-result-object v4

    .line 21
    new-instance v7, Lcom/google/firebase/auth/internal/zzaf;

    invoke-direct {v7, v4, v9}, Lcom/google/firebase/auth/internal/zzaf;-><init>(Lcom/google/firebase/FirebaseApp;Ljava/util/List;)V

    .line 22
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 23
    invoke-static {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    move-result-object v3

    .line 24
    invoke-virtual {v7, v3}, Lcom/google/firebase/auth/internal/zzaf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafm;)V

    :cond_3
    if-nez v5, :cond_4

    .line 25
    invoke-virtual {v7}, Lcom/google/firebase/auth/internal/zzaf;->zzb()Lcom/google/firebase/auth/FirebaseUser;

    .line 26
    :cond_4
    invoke-virtual {v7, v6}, Lcom/google/firebase/auth/internal/zzaf;->zza(Ljava/lang/String;)Lcom/google/firebase/auth/internal/zzaf;

    .line 27
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 28
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 29
    invoke-static {v1}, Lcom/google/firebase/auth/internal/zzah;->zza(Lorg/json/JSONObject;)Lcom/google/firebase/auth/internal/zzah;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 30
    invoke-virtual {v7, v1}, Lcom/google/firebase/auth/internal/zzaf;->zza(Lcom/google/firebase/auth/internal/zzah;)V

    .line 31
    :cond_5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 32
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 34
    :goto_1
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v10, v1, :cond_8

    .line 35
    invoke-virtual {p1, v10}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 36
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "factorIdKey"

    .line 37
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "phone"

    .line 38
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 39
    invoke-static {v3}, Lcom/google/firebase/auth/PhoneMultiFactorInfo;->zza(Lorg/json/JSONObject;)Lcom/google/firebase/auth/PhoneMultiFactorInfo;

    move-result-object v1

    goto :goto_2

    :cond_6
    const-string v4, "totp"

    .line 40
    invoke-static {v1, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 41
    invoke-static {v3}, Lcom/google/firebase/auth/TotpMultiFactorInfo;->zza(Lorg/json/JSONObject;)Lcom/google/firebase/auth/TotpMultiFactorInfo;

    move-result-object v1

    goto :goto_2

    :cond_7
    move-object v1, v2

    .line 42
    :goto_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 43
    :cond_8
    invoke-virtual {v7, v0}, Lcom/google/firebase/auth/internal/zzaf;->zzb(Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/internal/firebase-auth-api/zzxv; {:try_start_0 .. :try_end_0} :catch_0

    :cond_9
    return-object v7

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    goto :goto_3

    :catch_3
    move-exception p1

    .line 44
    :goto_3
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzby;->zzd:Le5/a;

    .line 45
    iget-object v0, v0, Le5/a;->a:Ljava/lang/String;

    .line 46
    invoke-static {v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v2
.end method

.method private final zzc(Lcom/google/firebase/auth/FirebaseUser;)Ljava/lang/String;
    .locals 12

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-class v2, Lcom/google/firebase/auth/internal/zzaf;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_d

    .line 17
    .line 18
    check-cast p1, Lcom/google/firebase/auth/internal/zzaf;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    :try_start_0
    const-string v2, "cachedTokenState"

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/google/firebase/auth/internal/zzaf;->zze()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    const-string v2, "applicationName"

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/google/firebase/auth/internal/zzaf;->zza()Lcom/google/firebase/FirebaseApp;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Lcom/google/firebase/FirebaseApp;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    const-string v2, "type"

    .line 44
    .line 45
    const-string v3, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    .line 46
    .line 47
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/google/firebase/auth/internal/zzaf;->zzi()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_9

    .line 55
    .line 56
    new-instance v2, Lorg/json/JSONArray;

    .line 57
    .line 58
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/google/firebase/auth/internal/zzaf;->zzi()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    const/4 v6, 0x2

    .line 74
    const/16 v7, 0x1e

    .line 75
    .line 76
    const/4 v8, 0x1

    .line 77
    if-le v5, v7, :cond_0

    .line 78
    .line 79
    iget-object v4, p0, Lcom/google/firebase/auth/internal/zzby;->zzd:Le5/a;

    .line 80
    .line 81
    const-string v5, "Provider user info list size larger than max size, truncating list to %d. Actual list size: %d"

    .line 82
    .line 83
    new-array v9, v6, [Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    aput-object v10, v9, v1

    .line 90
    .line 91
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    aput-object v10, v9, v8

    .line 100
    .line 101
    invoke-virtual {v4, v5, v9}, Le5/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    .line 103
    .line 104
    move v4, v7

    .line 105
    :cond_0
    move v5, v1

    .line 106
    move v7, v5

    .line 107
    :goto_0
    const-string v9, "firebase"

    .line 108
    .line 109
    if-ge v5, v4, :cond_3

    .line 110
    .line 111
    :try_start_1
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    check-cast v10, Lcom/google/firebase/auth/internal/zzab;

    .line 116
    .line 117
    invoke-virtual {v10}, Lcom/google/firebase/auth/internal/zzab;->getProviderId()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    if-eqz v11, :cond_1

    .line 126
    .line 127
    move v7, v8

    .line 128
    :cond_1
    add-int/lit8 v11, v4, -0x1

    .line 129
    .line 130
    if-ne v5, v11, :cond_2

    .line 131
    .line 132
    if-eqz v7, :cond_3

    .line 133
    .line 134
    :cond_2
    invoke-virtual {v10}, Lcom/google/firebase/auth/internal/zzab;->zzb()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-virtual {v2, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 139
    .line 140
    .line 141
    add-int/lit8 v5, v5, 0x1

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_3
    if-nez v7, :cond_8

    .line 145
    .line 146
    add-int/lit8 v5, v4, -0x1

    .line 147
    .line 148
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-ge v5, v10, :cond_6

    .line 153
    .line 154
    if-ltz v5, :cond_6

    .line 155
    .line 156
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    check-cast v10, Lcom/google/firebase/auth/internal/zzab;

    .line 161
    .line 162
    invoke-virtual {v10}, Lcom/google/firebase/auth/internal/zzab;->getProviderId()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    if-eqz v11, :cond_4

    .line 171
    .line 172
    invoke-virtual {v10}, Lcom/google/firebase/auth/internal/zzab;->zzb()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 177
    .line 178
    .line 179
    move v7, v8

    .line 180
    goto :goto_2

    .line 181
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    sub-int/2addr v11, v8

    .line 186
    if-ne v5, v11, :cond_5

    .line 187
    .line 188
    invoke-virtual {v10}, Lcom/google/firebase/auth/internal/zzab;->zzb()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    invoke-virtual {v2, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 193
    .line 194
    .line 195
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_6
    :goto_2
    if-nez v7, :cond_8

    .line 199
    .line 200
    iget-object v5, p0, Lcom/google/firebase/auth/internal/zzby;->zzd:Le5/a;

    .line 201
    .line 202
    const-string v7, "Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d"

    .line 203
    .line 204
    new-array v6, v6, [Ljava/lang/Object;

    .line 205
    .line 206
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 207
    .line 208
    .line 209
    move-result v9

    .line 210
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    aput-object v9, v6, v1

    .line 215
    .line 216
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    aput-object v4, v6, v8

    .line 221
    .line 222
    invoke-virtual {v5, v7, v6}, Le5/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    const/4 v5, 0x5

    .line 230
    if-ge v4, v5, :cond_8

    .line 231
    .line 232
    new-instance v4, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    const-string v5, "Provider user info list:\n"

    .line 235
    .line 236
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    if-eqz v5, :cond_7

    .line 248
    .line 249
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    check-cast v5, Lcom/google/firebase/auth/internal/zzab;

    .line 254
    .line 255
    const-string v6, "Provider - %s\n"

    .line 256
    .line 257
    new-array v7, v8, [Ljava/lang/Object;

    .line 258
    .line 259
    invoke-virtual {v5}, Lcom/google/firebase/auth/internal/zzab;->getProviderId()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    aput-object v5, v7, v1

    .line 264
    .line 265
    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    goto :goto_3

    .line 273
    :cond_7
    iget-object v3, p0, Lcom/google/firebase/auth/internal/zzby;->zzd:Le5/a;

    .line 274
    .line 275
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    new-array v5, v1, [Ljava/lang/Object;

    .line 280
    .line 281
    invoke-virtual {v3, v4, v5}, Le5/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    :cond_8
    const-string v3, "userInfos"

    .line 285
    .line 286
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 287
    .line 288
    .line 289
    :cond_9
    const-string v2, "anonymous"

    .line 290
    .line 291
    invoke-virtual {p1}, Lcom/google/firebase/auth/internal/zzaf;->isAnonymous()Z

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 296
    .line 297
    .line 298
    const-string v2, "version"

    .line 299
    .line 300
    const-string v3, "2"

    .line 301
    .line 302
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 303
    .line 304
    .line 305
    invoke-virtual {p1}, Lcom/google/firebase/auth/internal/zzaf;->getMetadata()Lcom/google/firebase/auth/FirebaseUserMetadata;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    if-eqz v2, :cond_a

    .line 310
    .line 311
    const-string v2, "userMetadata"

    .line 312
    .line 313
    invoke-virtual {p1}, Lcom/google/firebase/auth/internal/zzaf;->getMetadata()Lcom/google/firebase/auth/FirebaseUserMetadata;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    check-cast v3, Lcom/google/firebase/auth/internal/zzah;

    .line 318
    .line 319
    invoke-virtual {v3}, Lcom/google/firebase/auth/internal/zzah;->zza()Lorg/json/JSONObject;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 324
    .line 325
    .line 326
    :cond_a
    invoke-virtual {p1}, Lcom/google/firebase/auth/internal/zzaf;->getMultiFactor()Lcom/google/firebase/auth/MultiFactor;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    check-cast p1, Lcom/google/firebase/auth/internal/zzaj;

    .line 331
    .line 332
    invoke-virtual {p1}, Lcom/google/firebase/auth/internal/zzaj;->getEnrolledFactors()Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    if-eqz p1, :cond_c

    .line 337
    .line 338
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-nez v2, :cond_c

    .line 343
    .line 344
    new-instance v2, Lorg/json/JSONArray;

    .line 345
    .line 346
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 347
    .line 348
    .line 349
    move v3, v1

    .line 350
    :goto_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    if-ge v3, v4, :cond_b

    .line 355
    .line 356
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    check-cast v4, Lcom/google/firebase/auth/MultiFactorInfo;

    .line 361
    .line 362
    invoke-virtual {v4}, Lcom/google/firebase/auth/MultiFactorInfo;->toJson()Lorg/json/JSONObject;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 367
    .line 368
    .line 369
    add-int/lit8 v3, v3, 0x1

    .line 370
    .line 371
    goto :goto_4

    .line 372
    :cond_b
    const-string p1, "userMultiFactorInfo"

    .line 373
    .line 374
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 375
    .line 376
    .line 377
    :cond_c
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 381
    return-object p1

    .line 382
    :catch_0
    move-exception p1

    .line 383
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzby;->zzd:Le5/a;

    .line 384
    .line 385
    new-array v1, v1, [Ljava/lang/Object;

    .line 386
    .line 387
    iget-object v2, v0, Le5/a;->a:Ljava/lang/String;

    .line 388
    .line 389
    const-string v3, "Failed to turn object into JSON"

    .line 390
    .line 391
    invoke-virtual {v0, v3, v1}, Le5/a;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-static {v2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 396
    .line 397
    .line 398
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzxv;

    .line 399
    .line 400
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzxv;-><init>(Ljava/lang/Throwable;)V

    .line 401
    .line 402
    .line 403
    throw v0

    .line 404
    :cond_d
    const/4 p1, 0x0

    .line 405
    return-object p1
.end method


# virtual methods
.method public final zza(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/android/gms/internal/firebase-auth-api/zzafm;
    .locals 3

    .line 8
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 9
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzby;->zzc:Landroid/content/SharedPreferences;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 10
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseUser;->getUid()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 11
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1
.end method

.method public final zza()Lcom/google/firebase/auth/FirebaseUser;
    .locals 4

    const-string v0, "type"

    .line 1
    iget-object v1, p0, Lcom/google/firebase/auth/internal/zzby;->zzc:Landroid/content/SharedPreferences;

    const-string v2, "com.google.firebase.auth.FIREBASE_USER"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v3

    .line 3
    :cond_0
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    .line 6
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    invoke-direct {p0, v2}, Lcom/google/firebase/auth/internal/zzby;->zza(Lorg/json/JSONObject;)Lcom/google/firebase/auth/internal/zzaf;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_1
    return-object v3
.end method

.method public final zza(Lcom/google/firebase/auth/FirebaseUser;Lcom/google/android/gms/internal/firebase-auth-api/zzafm;)V
    .locals 3

    .line 48
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 49
    invoke-static {p2}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 50
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzby;->zzc:Landroid/content/SharedPreferences;

    .line 51
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 52
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseUser;->getUid()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzf()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 53
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzby;->zzc:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final zzb(Lcom/google/firebase/auth/FirebaseUser;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/google/firebase/auth/internal/zzby;->zzc(Lcom/google/firebase/auth/FirebaseUser;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzby;->zzc:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "com.google.firebase.auth.FIREBASE_USER"

    .line 21
    .line 22
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method
