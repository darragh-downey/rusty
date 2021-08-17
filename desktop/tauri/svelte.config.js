import preprocess from 'svelte-preprocess';
import adapter from '@sveltejs/adapter-static';

/** @type {import('@sveltejs/kit').Config} */
const config = {
	// Consult https://github.com/sveltejs/svelte-preprocess
	// for more information about preprocessors
	preprocess: preprocess(),

	kit: {
                // see https://medium.com/@cazanator/tauri-with-standard-svelte-or-sveltekit-ad7f103c37e7
                adapter: adapter({
                        pages: 'build',
                        assets: 'build',
                        fallback: 'app.html'
                }),
                ssr: false,
		// hydrate the <div id="svelte"> element in src/app.html
		target: '#svelte'
	}
};

export default config;
