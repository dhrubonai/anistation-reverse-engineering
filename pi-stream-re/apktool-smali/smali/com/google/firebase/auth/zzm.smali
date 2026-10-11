.class final Lcom/google/firebase/auth/zzm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/OnCompleteListener<",
        "Lcom/google/firebase/auth/internal/zzj;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zza:Lcom/google/firebase/auth/PhoneAuthOptions;

.field private final synthetic zzb:Ljava/lang/String;

.field private final synthetic zzc:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/PhoneAuthOptions;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/firebase/auth/zzm;->zzb:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/firebase/auth/zzm;->zzc:Lcom/google/firebase/auth/FirebaseAuth;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/firebase/auth/internal/zzj;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "Error while validating application identity: "

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v2, v3}, Lr/f;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :cond_0
    const-string v3, "FirebaseAuth"

    .line 26
    .line 27
    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-static {v1}, Lcom/google/firebase/auth/internal/zzb;->zza(Ljava/lang/Exception;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    check-cast v1, Lcom/google/firebase/FirebaseException;

    .line 39
    .line 40
    iget-object v2, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 41
    .line 42
    iget-object v3, v0, Lcom/google/firebase/auth/zzm;->zzb:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v1, v2, v3}, Lcom/google/firebase/auth/FirebaseAuth;->zza(Lcom/google/firebase/FirebaseException;Lcom/google/firebase/auth/PhoneAuthOptions;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    const-string v1, "Proceeding without any application identifier."

    .line 49
    .line 50
    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    move-object v11, v1

    .line 55
    move-object v12, v11

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lcom/google/firebase/auth/internal/zzj;

    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/google/firebase/auth/internal/zzj;->zzc()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Lcom/google/firebase/auth/internal/zzj;

    .line 72
    .line 73
    invoke-virtual {v2}, Lcom/google/firebase/auth/internal/zzj;->zza()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    move-object v11, v1

    .line 78
    move-object v12, v2

    .line 79
    :goto_0
    iget-object v1, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 80
    .line 81
    invoke-virtual {v1}, Lcom/google/firebase/auth/PhoneAuthOptions;->zzg()Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v7

    .line 89
    iget-object v1, v0, Lcom/google/firebase/auth/zzm;->zzc:Lcom/google/firebase/auth/FirebaseAuth;

    .line 90
    .line 91
    iget-object v2, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 92
    .line 93
    invoke-virtual {v2}, Lcom/google/firebase/auth/PhoneAuthOptions;->zzh()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iget-object v3, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 98
    .line 99
    invoke-virtual {v3}, Lcom/google/firebase/auth/PhoneAuthOptions;->zze()Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-static {v1, v2, v3}, Lcom/google/firebase/auth/FirebaseAuth;->zza(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;)Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_3

    .line 112
    .line 113
    iget-object v2, v0, Lcom/google/firebase/auth/zzm;->zzc:Lcom/google/firebase/auth/FirebaseAuth;

    .line 114
    .line 115
    iget-object v3, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 116
    .line 117
    invoke-virtual {v2, v3, v1}, Lcom/google/firebase/auth/FirebaseAuth;->zza(Lcom/google/firebase/auth/PhoneAuthOptions;Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;)Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    :cond_3
    move-object v14, v1

    .line 122
    iget-object v1, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 123
    .line 124
    invoke-virtual {v1}, Lcom/google/firebase/auth/PhoneAuthOptions;->zzc()Lcom/google/firebase/auth/MultiFactorSession;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-static {v1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    move-object v4, v1

    .line 132
    check-cast v4, Lcom/google/firebase/auth/internal/zzam;

    .line 133
    .line 134
    invoke-virtual {v4}, Lcom/google/firebase/auth/internal/zzam;->zzd()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    const/4 v2, 0x1

    .line 139
    const/4 v3, 0x0

    .line 140
    if-eqz v1, :cond_5

    .line 141
    .line 142
    iget-object v1, v0, Lcom/google/firebase/auth/zzm;->zzc:Lcom/google/firebase/auth/FirebaseAuth;

    .line 143
    .line 144
    invoke-static {v1}, Lcom/google/firebase/auth/FirebaseAuth;->zzc(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/zzaag;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iget-object v5, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 149
    .line 150
    invoke-virtual {v5}, Lcom/google/firebase/auth/PhoneAuthOptions;->zzh()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-static {v5}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-object v6, v0, Lcom/google/firebase/auth/zzm;->zzc:Lcom/google/firebase/auth/FirebaseAuth;

    .line 158
    .line 159
    invoke-static {v6}, Lcom/google/firebase/auth/FirebaseAuth;->zze(Lcom/google/firebase/auth/FirebaseAuth;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    iget-object v9, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 164
    .line 165
    invoke-virtual {v9}, Lcom/google/firebase/auth/PhoneAuthOptions;->zzd()Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    if-eqz v9, :cond_4

    .line 170
    .line 171
    move v9, v2

    .line 172
    goto :goto_1

    .line 173
    :cond_4
    move v9, v3

    .line 174
    :goto_1
    iget-object v2, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 175
    .line 176
    invoke-virtual {v2}, Lcom/google/firebase/auth/PhoneAuthOptions;->zzk()Z

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    iget-object v2, v0, Lcom/google/firebase/auth/zzm;->zzc:Lcom/google/firebase/auth/FirebaseAuth;

    .line 181
    .line 182
    invoke-virtual {v2}, Lcom/google/firebase/auth/FirebaseAuth;->zzi()Z

    .line 183
    .line 184
    .line 185
    move-result v13

    .line 186
    iget-object v2, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 187
    .line 188
    invoke-virtual {v2}, Lcom/google/firebase/auth/PhoneAuthOptions;->zzi()Ljava/util/concurrent/Executor;

    .line 189
    .line 190
    .line 191
    move-result-object v15

    .line 192
    iget-object v2, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 193
    .line 194
    invoke-virtual {v2}, Lcom/google/firebase/auth/PhoneAuthOptions;->zza()Landroid/app/Activity;

    .line 195
    .line 196
    .line 197
    move-result-object v16

    .line 198
    move-object v3, v1

    .line 199
    invoke-virtual/range {v3 .. v16}, Lcom/google/android/gms/internal/firebase-auth-api/zzaag;->zza(Lcom/google/firebase/auth/internal/zzam;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;ZLcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;Ljava/util/concurrent/Executor;Landroid/app/Activity;)Lcom/google/android/gms/tasks/Task;

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :cond_5
    iget-object v1, v0, Lcom/google/firebase/auth/zzm;->zzc:Lcom/google/firebase/auth/FirebaseAuth;

    .line 204
    .line 205
    invoke-static {v1}, Lcom/google/firebase/auth/FirebaseAuth;->zzc(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/zzaag;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    iget-object v5, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 210
    .line 211
    invoke-virtual {v5}, Lcom/google/firebase/auth/PhoneAuthOptions;->zzf()Lcom/google/firebase/auth/PhoneMultiFactorInfo;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    invoke-static {v5}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    iget-object v6, v0, Lcom/google/firebase/auth/zzm;->zzc:Lcom/google/firebase/auth/FirebaseAuth;

    .line 219
    .line 220
    invoke-static {v6}, Lcom/google/firebase/auth/FirebaseAuth;->zze(Lcom/google/firebase/auth/FirebaseAuth;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    iget-object v9, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 225
    .line 226
    invoke-virtual {v9}, Lcom/google/firebase/auth/PhoneAuthOptions;->zzd()Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    if-eqz v9, :cond_6

    .line 231
    .line 232
    move v9, v2

    .line 233
    goto :goto_2

    .line 234
    :cond_6
    move v9, v3

    .line 235
    :goto_2
    iget-object v2, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 236
    .line 237
    invoke-virtual {v2}, Lcom/google/firebase/auth/PhoneAuthOptions;->zzk()Z

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    iget-object v2, v0, Lcom/google/firebase/auth/zzm;->zzc:Lcom/google/firebase/auth/FirebaseAuth;

    .line 242
    .line 243
    invoke-virtual {v2}, Lcom/google/firebase/auth/FirebaseAuth;->zzi()Z

    .line 244
    .line 245
    .line 246
    move-result v13

    .line 247
    iget-object v2, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 248
    .line 249
    invoke-virtual {v2}, Lcom/google/firebase/auth/PhoneAuthOptions;->zzi()Ljava/util/concurrent/Executor;

    .line 250
    .line 251
    .line 252
    move-result-object v15

    .line 253
    iget-object v2, v0, Lcom/google/firebase/auth/zzm;->zza:Lcom/google/firebase/auth/PhoneAuthOptions;

    .line 254
    .line 255
    invoke-virtual {v2}, Lcom/google/firebase/auth/PhoneAuthOptions;->zza()Landroid/app/Activity;

    .line 256
    .line 257
    .line 258
    move-result-object v16

    .line 259
    move-object v3, v1

    .line 260
    invoke-virtual/range {v3 .. v16}, Lcom/google/android/gms/internal/firebase-auth-api/zzaag;->zza(Lcom/google/firebase/auth/internal/zzam;Lcom/google/firebase/auth/PhoneMultiFactorInfo;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;ZLcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;Ljava/util/concurrent/Executor;Landroid/app/Activity;)Lcom/google/android/gms/tasks/Task;

    .line 261
    .line 262
    .line 263
    return-void
.end method
