package com.example.giovanni.giovanni.log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LogAdapter extends FragmentPagerAdapter {

    private final String [] fragments = {"Array", "Articolo", "Ascensore", "Dipendente e progetto", "Dipendente, manager e azienda"};

    private final ArrayFragment arrayFragment = new ArrayFragment();
    private final ArticoloFragment articoloFragment = new ArticoloFragment();
    private final AscensoreFragment ascensoreFragment = new AscensoreFragment();
    private final DipendenteProgettoFragment dipendenteProgettoFragment = new DipendenteProgettoFragment();
    private final DipendenteManagerAziendaFragment dipendenteManagerAziendaFragment = new DipendenteManagerAziendaFragment();

    LogAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return arrayFragment;
            case 1: return articoloFragment;
            case 2: return ascensoreFragment;
            case 3: return dipendenteProgettoFragment;
            case 4: return dipendenteManagerAziendaFragment;
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragments[position];
    }
}