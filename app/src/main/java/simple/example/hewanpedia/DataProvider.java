package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Ayam;
import simple.example.hewanpedia.model.Burung;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Ikan;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Ayam> initDataAyam(Context ctx) {
        List<Ayam> ayams = new ArrayList<>();
        ayams.add(new Ayam(ctx.getString(R.string.kapas_ayam), ctx.getString(R.string.kapas_asal),ctx.getString(R.string.kapas_deskripsi), R.drawable.ayam_kapas));
        ayams.add(new Ayam(ctx.getString(R.string.orpingtond_ayam), ctx.getString(R.string.orpington_asal), ctx.getString(R.string.orpington_deskripsi), R.drawable.ayam_orpington));
        ayams.add(new Ayam(ctx.getString(R.string.kedu_ayam), ctx.getString(R.string.kedu_asal), ctx.getString(R.string.kedu_deskripsi), R.drawable.ayam_kedu));
        ayams.add(new Ayam(ctx.getString(R.string.wyandotted_ayam), ctx.getString(R.string.wyandotte_asal), ctx.getString(R.string.wyandotte_deskripsi), R.drawable.ayam_wyandotte));
        ayams.add(new Ayam(ctx.getString(R.string.shamo_ayam), ctx.getString(R.string.shamo_asal), ctx.getString(R.string.shamo_deskripsi), R.drawable.ayam_shamo));
        ayams.add(new Ayam(ctx.getString(R.string.serama_ayam), ctx.getString(R.string.serama_asal), ctx.getString(R.string.serama_deskripsi), R.drawable.ayam_serama));
        return ayams;
    }

    private static List<Burung> initDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung(ctx.getString(R.string.turako_burung), ctx.getString(R.string.turako_asal), ctx.getString(R.string.turako_deskripsi), R.drawable.burung_turako));
        burungs.add(new Burung(ctx.getString(R.string.sphenisciformes_burung), ctx.getString(R.string.sphenisciformes_asal), ctx.getString(R.string.sphenisciformes_deskripsi), R.drawable.burung_sphenisciformes));
        burungs.add(new Burung(ctx.getString(R.string.cerek_burung), ctx.getString(R.string.cerek_asal), ctx.getString(R.string.cerak_deskripsi), R.drawable.burung_cerek_dan_trulek));
        burungs.add(new Burung(ctx.getString(R.string.sulidae_burung), ctx.getString(R.string.sulidae_asal), ctx.getString(R.string.sulidae_deskripsi), R.drawable.burung_sulidae));
        burungs.add(new Burung(ctx.getString(R.string.otididae_burung), ctx.getString(R.string.otididae_asal), ctx.getString(R.string.otididae_deskripsi), R.drawable.burung_otidedae));
        burungs.add(new Burung(ctx.getString(R.string.dara_laut_burung), ctx.getString(R.string.dara_Laut_asal), ctx.getString(R.string.dara_laut_deskripsi), R.drawable.burung_dara_laut));
        return burungs;
    }

    private static List<Ikan> initDataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan(ctx.getString(R.string.mandarin_ikan), ctx.getString(R.string.mandarin_asal), ctx.getString(R.string.mandarin_deskripsi), R.drawable.ikan_mandarin));
        ikans.add(new Ikan(ctx.getString(R.string.matahari_ikan), ctx.getString(R.string.matahari_asal), ctx.getString(R.string.matahari_deskripsi), R.drawable.ikan_matahari));
        ikans.add(new Ikan(ctx.getString(R.string.raja_herring_ikan), ctx.getString(R.string.raja_herring_asal), ctx.getString(R.string.raja_herring_deskripsi), R.drawable.raja_herring));
        ikans.add(new Ikan(ctx.getString(R.string.zebra_ikan), ctx.getString(R.string.zebra_asal), ctx.getString(R.string.zebra_deskripsi), R.drawable.ikan_zebra));
        ikans.add(new Ikan(ctx.getString(R.string.leter_enam_ikan), ctx.getString(R.string.leter_enam_asal), ctx.getString(R.string.leter_enam_deskripsi), R.drawable.leter_enam));
        ikans.add(new Ikan(ctx.getString(R.string.molly_ikan), ctx.getString(R.string.molly_asal), ctx.getString(R.string.molly_deskripsi), R.drawable.molly));
        return ikans;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataAyam(ctx));
        hewans.addAll(initDataBurung(ctx));
        hewans.addAll(initDataIkan(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
