.class public final Landroidx/appcompat/widget/k4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La4/c;La4/c;La4/c;La4/c;Lx3/v;Lx3/x;)V
    .locals 2

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Lk3/d;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lk3/d;-><init>(Ljava/lang/Object;I)V

    const/16 v1, 0x96

    .line 19
    invoke-static {v1, v0}, Lq6/g;->o0(ILq4/a;)Lf/c;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/k4;->g:Ljava/lang/Object;

    .line 20
    iput-object p1, p0, Landroidx/appcompat/widget/k4;->a:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, Landroidx/appcompat/widget/k4;->b:Ljava/lang/Object;

    .line 22
    iput-object p3, p0, Landroidx/appcompat/widget/k4;->c:Ljava/lang/Object;

    .line 23
    iput-object p4, p0, Landroidx/appcompat/widget/k4;->d:Ljava/lang/Object;

    .line 24
    iput-object p5, p0, Landroidx/appcompat/widget/k4;->e:Ljava/lang/Object;

    .line 25
    iput-object p6, p0, Landroidx/appcompat/widget/k4;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/k4;->d:Ljava/lang/Object;

    .line 3
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/k4;->e:Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 4
    iput-object v1, p0, Landroidx/appcompat/widget/k4;->f:Ljava/lang/Object;

    new-array v0, v0, [I

    .line 5
    iput-object v0, p0, Landroidx/appcompat/widget/k4;->g:Ljava/lang/Object;

    .line 6
    iput-object p1, p0, Landroidx/appcompat/widget/k4;->a:Ljava/lang/Object;

    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0d001b

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/k4;->b:Ljava/lang/Object;

    const v0, 0x7f0a0133

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Landroidx/appcompat/widget/k4;->c:Ljava/lang/Object;

    .line 9
    iget-object p1, p0, Landroidx/appcompat/widget/k4;->d:Ljava/lang/Object;

    check-cast p1, Landroid/view/WindowManager$LayoutParams;

    const-class v0, Landroidx/appcompat/widget/k4;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    .line 10
    iget-object p1, p0, Landroidx/appcompat/widget/k4;->d:Ljava/lang/Object;

    check-cast p1, Landroid/view/WindowManager$LayoutParams;

    iget-object v0, p0, Landroidx/appcompat/widget/k4;->a:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    .line 11
    iget-object p1, p0, Landroidx/appcompat/widget/k4;->d:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x3ea

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 12
    move-object v0, p1

    check-cast v0, Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 13
    move-object v0, p1

    check-cast v0, Landroid/view/WindowManager$LayoutParams;

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 14
    move-object v0, p1

    check-cast v0, Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x3

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 15
    move-object v0, p1

    check-cast v0, Landroid/view/WindowManager$LayoutParams;

    const v1, 0x7f130004

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 16
    check-cast p1, Landroid/view/WindowManager$LayoutParams;

    const/16 v0, 0x18

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    return-void
.end method
